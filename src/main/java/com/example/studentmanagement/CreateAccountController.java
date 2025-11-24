package com.example.studentmanagement;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CreateAccountController {
    @FXML private TextField studentIdField;
    @FXML private TextField passwordField;
    @FXML private TextField lastNameField;
    @FXML private TextField firstNameField;

    private UserRepository userRepo = new UserRepository();

    @FXML
    private void handleCreateAccount() {
        String studentId = studentIdField.getText();
        String password = passwordField.getText();
        String lastName = lastNameField.getText();
        String firstName = firstNameField.getText();

        //Empty field validation
        if (studentId.isEmpty() || password.isEmpty() || lastName.isEmpty() || firstName.isEmpty()) {
            System.out.println("All fields must be filled.");
            return;
        }

        User newUser = new User(studentId, password, lastName, firstName);

        //Use boolean return from repository
        boolean success = userRepo.addUser(newUser);

        if (success) {
            System.out.println("Account created successfully!");
            // Redirect to login page
        } else {
            System.out.println("Account creation failed. Student ID already exists.");
        }
    }

    @FXML
    private void handleHaveAccount() {
    }
}