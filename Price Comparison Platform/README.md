# Price Comparison Platform

## Overview
A platform to help consumers optimize spending on groceries and electronics. Users can compare prices among retailers and find the best deals.

### Features
- **Price Comparison**: Compare prices across multiple stores with discounts/promotions.
- **Shopping Cart**: Add/remove items and manage purchases.

## Business Rules
1. **User Segmentation**: Users are classified as Consumers or Store Managers.
2. **Store Management**: Store details are managed by Store Managers.
3. **Product Information**: Includes product name, category, specifications, and prices.
4. **Inventory Management**: Store Managers manage inventory and pricing.
5. **Shopping Cart Ownership**: Each user can have a shopping cart associated with their account.

## Views
1. **Product_Details_View**: Displays product details, price, and store information.
2. **Price_Comparison_View**: Shows side-by-side comparison of product prices across different stores.
3. **Shopping_Cart_View**: Displays cart items, allows item removal, and shows total costs.
4. **Store_Inventory_View**: Allows Store Managers to view and update store inventory.
5. **Price_Update_View**: Store Managers can update product prices.
7. **Store_Details_View**: Shows store information, such as location and products available.

## Security Roles
1. **Admin**: Full control, CRUD access to all tables and views.
2. **Store Manager**: Manage store inventory, update product prices, access inventory and price update views.
3. **Consumer**: Browse products, submit reviews, manage cart, access comparison and product details views.

## Database Tables
1. **User**: Manages user details (User_ID, User_Name, etc.)
2. **Cart**: Tracks user shopping carts (Cart_ID, User_ID, CartTotal).
3. **Cart_Items**: Manages items in carts (CartItem_ID, Product_ID, Quantity).
4. **Product**: Stores product details (Product_ID, Name, Category, Description).
5. **Prices**: Tracks pricing info (Price_ID, Product_ID, Price, DateLastUpdated).
6. **Store**: Contains store information (Store_ID, Name, Location).
7. **Review**: Stores user reviews (Review_ID, User_ID, Product_ID, Rating, Comments).
