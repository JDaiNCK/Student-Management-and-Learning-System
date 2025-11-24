package com.example.studentmanagement;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button; //Import added

public class LoginController {
    @FXML
    private TextField studentIdField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton; // e connect ang button para dili mo pula

    private UserRepository userRepo = new UserRepository();

    @FXML
    private void handleLogin() {
        String studentId = studentIdField.getText();
        String password = passwordField.getText();

        // ✅ Empty field validation
        if (studentId.isEmpty() || password.isEmpty()) {
            System.out.println("Please fill in all fields.");
            return;
        }

        // ✅ Authenticate with backend
        boolean success = userRepo.authenticate(studentId, password);

        if (success) {
            System.out.println("Login successful!");
            //Redirect to dashboard page
        } else {
            System.out.println("Invalid credentials. Try again.");
        }
    }
}
