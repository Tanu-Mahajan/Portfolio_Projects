package finflow.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import finflow.dao.DatabaseConnection;
import finflow.dao.UserDAO;
import finflow.dao.UserDAOImpl;
import finflow.model.User;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ProfileController implements Initializable {


	@FXML
    private Button btnCreateAccount;

    @FXML
    private PasswordField txtConfirmPassword;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtPhone;

    @FXML
    private TextField txtfirstName;

    @FXML
    private TextField txtlastName;

    @FXML
    private TextField txtuserName;
    
    private String existingUserName;


    private UserDAO userDAO;

    public ProfileController() {
        
    }

    @Override
    public void initialize(URL location, ResourceBundle resources){
        // Load user details and display them
    	this.userDAO = new UserDAOImpl(new DatabaseConnection());
    	try {
            ResultSet currentUser = userDAO.UserDetails(LoginController.getInstance().activeID());
            if (currentUser.next()) {
                txtfirstName.setText(currentUser.getString("fname"));
                txtlastName.setText(currentUser.getString("lname"));
                txtPhone.setText(currentUser.getString("phone"));
                txtuserName.setText(currentUser.getString("username"));
                existingUserName = currentUser.getString("username");    
            }
          currentUser.close(); // Close ResultSet
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void Update(ActionEvent event) {
        // Retrieve values from text fields
        String firstName = txtfirstName.getText();
        String lastName = txtlastName.getText();
        String phone = txtPhone.getText();
        String userName = txtuserName.getText();

        if (firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || userName.isEmpty()) {
            showAlert("Error", "Please fill in all fields.");
            return; // Exit the method if any field is blank
        }
        
        // Validate first name
        if (!isValidfName(firstName)) {
            showAlert("Error", "First name should only contain alphabetic characters.");
            return; 
        }
        
        // Validate first name
        if (!isValidlName(lastName)) {
            showAlert("Error", "Last name should only contain alphabetic characters.");
            return;
        }
        
        if(!existingUserName.equalsIgnoreCase(txtuserName.getText()) && userDAO.userExists(txtuserName.getText())) {
        	showAlert("Error", "Username already in use");
            return;
        }
        
        // Validate phone number
        if (!isValidPhone(phone)) {
            showAlert("Error", "Phone number should only contain numeric characters.");
            return; 
        }
        
        // Validate phone number length
        if (phone.length() != 10) {
            showAlert("Error", "Phone number should be 10 digits long.");
            return;
        }
        
        // Create a new User object with the updated details
        User updatedUser = new User();
        updatedUser.setUsername(userName);
        updatedUser.setFirstName(firstName);
        updatedUser.setLastName(lastName);
        updatedUser.setPhone(phone);
        // Assuming you have a way to retrieve the user's ID, for example from a session
        int userID = LoginController.getInstance().activeID();
        updatedUser.setId(userID);

        // Perform update operation
        boolean success = userDAO.updateUserDetails(updatedUser);

        // Show success or failure message
        if (success) {
            showAlert("Success", "Profile updated successfully.");
        } else {
            showAlert("Error", "Failed to update profile.");
        }
        LoginController.getInstance().setUsername(userName);
    }

    private boolean isValidfName(String firstName) {
        // Regular expression to check if the name contains only alphabetic characters
        return firstName.matches("[a-zA-Z]+");
    }
    
    private boolean isValidlName(String lastName) {
        // Regular expression to check if the name contains only alphabetic characters
        return lastName.matches("[a-zA-Z]+");
    }
    
    private boolean isValidPhone(String phone) {
        // Regular expression to check if the phone number contains only numeric characters
        return phone.matches("[0-9]+");
    }
    
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
 }
