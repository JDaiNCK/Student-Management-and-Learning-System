package com.example.studentmanagement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
import java.io.IOException;

public class LoginSMIS {

    @FXML
    public void Login(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationSMIS.class.getResource("SMISHome.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void ForgotPass(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationSMIS.class.getResource("SMISForgotPass.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Forgot Password");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void Register(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationSMIS.class.getResource("SMISCreateAcc.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Create Account");
        stage.setScene(scene);
        stage.show();
    }
    public void LogAgain(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationSMIS.class.getResource("SMIS.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void Back(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationSMIS.class.getResource("SMIS.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }
}
