--3.--ADD_TO_CART_ITEMS
--This procedure takes input from customer like : Name, Product Name, Quantity, MOde_of_payment, whether he/she wants to check out their cart items or not 
--First it checks if there is any active cart againts a user , if found then insert data in that one 
-- if not found then creates a new entry 

SET SERVEROUTPUT ON

CREATE OR REPLACE PROCEDURE ADD_TO_CART_ITEMS(
    PI_USER_NAME VARCHAR2,
    PI_PRODUCT_NAME VARCHAR2,
    PI_QUANTITY NUMBER,
    PI_MODE_OF_PAYMENT VARCHAR2,
    PI_IS_CHECKED_OUT CHAR
)
AS
    V_Cart_ID CART.CART_ID%TYPE;
    V_User_ID USERS.User_id%TYPE;
    V_Product_ID PRODUCT.PRODUCT_ID%TYPE;
    V_Price_ID PRICES.PRICE_ID%TYPE;
    V_Existing_Quantity CART_ITEMS.Quantity%TYPE;
    V_IsCheckedOut CART_ITEMS.isCheckedOut%TYPE;
    E_USER_NOT_FOUND EXCEPTION;
BEGIN
    -- Check if there's an active cart for the user
    BEGIN
        SELECT Cart_ID, User_ID
        INTO V_Cart_ID, V_User_ID
        FROM USER_CART_VIEW
        WHERE USER_NAME = PI_USER_NAME;
        
        IF V_User_ID IS NULL THEN
            RAISE E_USER_NOT_FOUND;
        END IF;
        
        DBMS_OUTPUT.PUT_LINE('USER_ID: ' || V_User_ID);
        
    EXCEPTION
        WHEN E_USER_NOT_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('No active user_ID found for the user.'); 
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('No active cart found for the user.'); 
            RETURN;
        WHEN OTHERS THEN
            DBMS_OUTPUT.PUT_LINE('An error occurred while searching for the cart.');
            RETURN;
    END;
    
    -- Get the current checked out status for the cart
    BEGIN
        
        IF PI_IS_CHECKED_OUT = 'Y' THEN
            DBMS_OUTPUT.PUT_LINE('Unable to proceed with checkout; shopping is currently in progress');
            -- Throw an error or handle this scenario as required.
            RETURN;
        END IF;
        
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            -- No items checked out yet, proceed with adding items to the cart
            NULL;
    END;


    -- Get the Product_ID and Price_ID based on the Product_Name
    BEGIN
        SELECT Product_ID, Price_ID
        INTO V_Product_ID, V_Price_ID
        FROM (
            SELECT Product_ID, Price_ID
            FROM PRODUCT_PRICE_VIEW
            WHERE Product_NAME = PI_PRODUCT_NAME
            AND ROWNUM = 1 -- Limit to one record
        );
        
        DBMS_OUTPUT.PUT_LINE('PRODUCT ID: ' || V_Product_ID);
        DBMS_OUTPUT.PUT_LINE('PRICE ID: ' || V_Price_ID);
        
        -- Check if the username and product name already exist in cart_items
        BEGIN
            SELECT Quantity
            INTO V_Existing_Quantity
            FROM CART_ITEMS
            WHERE Cart_ID = V_Cart_ID
            AND Product_ID = V_Product_ID;
            
            -- If the entry exists, update the quantity
            UPDATE CART_ITEMS
            SET Quantity = V_Existing_Quantity + PI_QUANTITY
            WHERE Cart_ID = V_Cart_ID
            AND Product_ID = V_Product_ID;
            
            DBMS_OUTPUT.PUT_LINE('Existing product quantity updated.');
            COMMIT;
            
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                DBMS_OUTPUT.PUT_LINE('Product not found in the cart.');
                
                -- Insert the item into CART_ITEMS if it doesn't exist
                IF V_Cart_ID IS NOT NULL THEN
                    INSERT INTO CART_ITEMS (CartItem_ID, Cart_ID, Product_ID, Quantity, Price_ID, isCheckedOut, ModeOfPayment)
                    VALUES (CART_ITEMS_SEQ.NEXTVAL, V_Cart_ID, V_Product_ID, PI_QUANTITY, V_Price_ID, PI_IS_CHECKED_OUT, PI_MODE_OF_PAYMENT);
                    
                    DBMS_OUTPUT.PUT_LINE('New product added to the cart_items.');
                    COMMIT;
                ELSE
                    DBMS_OUTPUT.PUT_LINE('No active cart found. Skipping insertion into CART_ITEMS.');
                    -- Optionally handle this scenario or perform additional actions if needed.
                END IF;
        END;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('Product not found.');
            -- Handle if the product doesn't exist.
        WHEN OTHERS THEN
            DBMS_OUTPUT.PUT_LINE('An error occurred: ' || SQLERRM);
            -- Handle other exceptions as needed.
            ROLLBACK; -- Rollback changes made within the procedure due to exception.
    END;
END ADD_TO_CART_ITEMS;
/



--EXECUTE ADD_TO_CART_ITEMS('Chris Williams','Smartphone',4,'Debit', 'N');

--EXECUTE ADD_TO_CART_ITEMS('Jane Smith','Whole milk',2,'Debit', 'Y');

--EXECUTE ADD_TO_CART_ITEMS('Mike Johnson','HP Laptop',1,'Debit', 'N');

--EXECUTE ADD_TO_CART_ITEMS('Alex Clark','Spaghetti',3,'Debit', 'N');