package finflow.controller;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import finflow.dao.DatabaseConnection;
import finflow.dao.UserDAO;
import finflow.dao.UserDAOImpl;
import finflow.model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class ForgotPasswordController implements Initializable {

    @FXML
    private PasswordField txtnewPassword;

    @FXML
    private PasswordField txtretypenewPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    private Button btnUpdate;
    
    @FXML
    private Button buttonBack;    

    private UserDAO userDAO;

    @FXML
    private void UpdatePassword(ActionEvent event) {
        String username = txtUsername.getText();
        String newPassword = txtnewPassword.getText();
        String retypeNewPassword = txtretypenewPassword.getText();

        // Basic validation
        if (newPassword.isEmpty() || retypeNewPassword.isEmpty() || username.isEmpty()) {
            showAlert(AlertType.ERROR, "Error", "Missing Information", "Please fill in all fields.");
            return;
        }

        if (!newPassword.equals(retypeNewPassword)) {
            showAlert(AlertType.ERROR, "Error", "Password Mismatch", "Passwords do not match. Please type again.");
            return;
        }

        // Retrieve the user's ID based on the provided username
        int userID = userDAO.getUserIdByUsername(username);

        //Validation to check if the user exists in the database
        if (userID == -1) {
            showAlert(AlertType.ERROR, "Error", "User Not Found", "The provided username does not exist.");
            
            // Clear password fields
            txtnewPassword.clear();
            txtretypenewPassword.clear();
            
            //Clear username field
            txtUsername.clear();
            
            return;
        }

        User updatedUserPassword = new User();
        updatedUserPassword.setUsername(username);
        updatedUserPassword.setPassword(newPassword);
        updatedUserPassword.setId(userID);

        // Update the user's password in the database
        boolean passwordUpdated = userDAO.updateUserPassword(updatedUserPassword);

        if (passwordUpdated) {
            showAlert(AlertType.INFORMATION, "Success", "Password Updated",
                    "Your password has been updated successfully.");
        } else {
            showAlert(AlertType.ERROR, "Error", "Update Failed", "Failed to update password. Please try again later.");
        }
    }
    
    @FXML
    void onClickBack(ActionEvent event) throws IOException {
    	buttonBack.getScene().getWindow().hide();
        Stage signupPage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/finflow/view/Login.fxml"));
        Scene scene = new Scene(root);
        Image image = new Image("finflow/images/logo2.png");
        signupPage.getIcons().add(image);
        signupPage.setScene(scene);
        signupPage.show();
        signupPage.setResizable(false);
    }

    // Method to show alert dialog
    private void showAlert(AlertType alertType, String title, String headerText, String contentText) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);
        alert.showAndWait();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.userDAO = new UserDAOImpl(new DatabaseConnection()); // Pass a valid DatabaseConnection instance
    }
}
