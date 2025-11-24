package com.example.studentmanagement;

import com.example.studentmanagement.data.User;
import com.example.studentmanagement.data.UsersData;
import javafx.scene.control.Alert;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
import java.io.IOException;

public class SignInSignUpSMIS {

    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField studentField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField loginEmailField;
    @FXML
    private PasswordField loginPasswordField;

    @FXML
    private void handleCreateAccountClick(ActionEvent event) throws IOException {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String email = studentField.getText();
        String password = passwordField.getText();

        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please fill in all fields!");
            return;
        }

        if (!email.contains("@liceo.edu.ph")) {
            showAlert(Alert.AlertType.ERROR, "Invalid Email", "Email must contain '@liceo.edu.ph'!");
            return;
        }

        // Check if email already exists
        for (User user : UsersData.userList) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                showAlert(Alert.AlertType.ERROR, "Duplicate Email", "Email is already registered!");
                return;
            }
        }

        String userId = "U" + System.currentTimeMillis();
        User newUser = new User(userId, email, firstName, lastName, password);
        UsersData.userList.add(newUser);

        System.out.println("User saved!");
        System.out.println("ID: " + userId);
        System.out.println("Email: " + email);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Password: " + password);
        System.out.println("Total users: " + UsersData.userList.size());

        showAlert(Alert.AlertType.INFORMATION, "Success", "Account created successfully!");

        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationSMIS.class.getResource("SMISCreateAcc.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 480);
        scene.getStylesheets().add(ApplicationSMIS.class.getResource("SMISstyle.css").toExternalForm());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Create Account");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    private void handleLoginClick(ActionEvent event) throws IOException {
        String student = loginEmailField.getText();
        String password = loginPasswordField.getText();

        if (student.isEmpty() || password.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please enter email and password!");
            return;
        }

        User userFound = null;
        for (User u : UsersData.userList) {
            if (u.getEmail().equalsIgnoreCase(student)) {
                userFound = u;
                break;
            }
        }

        if (userFound == null) {
            showAlert(Alert.AlertType.ERROR, "Login Failed", "Account does not exist!");
            return;
        }

        if (!userFound.getPassword().equals(password)) {
            showAlert(Alert.AlertType.ERROR, "Login Failed", "Incorrect password!");
            return;
        }

        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationSMIS.class.getResource("SMISHome.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 480);
        scene.getStylesheets().add(ApplicationSMIS.class.getResource("SMISstyle.css").toExternalForm());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(scene);
        stage.show();
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    public void Register(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationSMIS.class.getResource("SMISCreateAcc.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 480);
        scene.getStylesheets().add(ApplicationSMIS.class.getResource("SMISstyle.css").toExternalForm());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Create Account");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    public void Login(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationSMIS.class.getResource("SMISHome.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 480);
        scene.getStylesheets().add(ApplicationSMIS.class.getResource("SMISstyle.css").toExternalForm());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void ForgotPass(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationSMIS.class.getResource("SMISForgotPass.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 480);
        scene.getStylesheets().add(ApplicationSMIS.class.getResource("SMISstyle.css").toExternalForm());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Forgot Password");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void Back(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationSMIS.class.getResource("SMIS.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 480);
        scene.getStylesheets().add(ApplicationSMIS.class.getResource("SMISstyle.css").toExternalForm());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }
}
