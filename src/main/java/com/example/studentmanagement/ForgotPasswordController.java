package com.example.studentmanagement;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class ForgotPasswordController {

    @FXML
    private TextField usernameField;

    @FXML
    private Label messageLabel;

    private final UserRepository userRepo = new UserRepository();

    @FXML
    private void handleSendEmail() {
        String username = usernameField.getText();

        if (username == null || username.isEmpty()) {
            System.out.println("Please enter your username.");
            if (messageLabel != null) messageLabel.setText("Please enter your username.");
            return;
        }

        User user = userRepo.findUserByUsername(username);

        if (user != null) {
            System.out.println("Your password is: " + user.getPassword());
            if (messageLabel != null) messageLabel.setText("Your password is: " + user.getPassword());
        } else {
            System.out.println("User not found.");
            if (messageLabel != null) messageLabel.setText("User not found.");
        }
    }

    @FXML
    private void handleLoginAgain() {
        System.out.println("Redirecting to login...");
    }
}
