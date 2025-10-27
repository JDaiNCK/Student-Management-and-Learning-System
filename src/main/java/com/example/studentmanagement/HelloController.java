package com.example.studentmanagement;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void Login() {
        welcomeText.setText("Welcome User");
    }
    @FXML
    protected void ForgotPass() {
        welcomeText.setText("Bayot si JanJan");
    }
    @FXML
    protected void CreateAcc() {
        welcomeText.setText("Opaw si Farz");
    }
}
