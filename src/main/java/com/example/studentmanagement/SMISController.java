package com.example.studentmanagement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
import java.io.IOException;

public class SMISController {


    @FXML
    public void Login(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SMISApplication.class.getResource("SMISHome.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 670, 440);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void ForgotPass(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SMISApplication.class.getResource("SMISForgotPass.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 670, 440);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Forgot Password");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void Register(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SMISApplication.class.getResource("SMISCreateAcc.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 670, 440);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Forgot Password");
        stage.setScene(scene);
        stage.show();
    }
    public void LogAgain(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SMISApplication.class.getResource("SMIS.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 670, 440);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Forgot Password");
        stage.setScene(scene);
        stage.show();
    }
    public void Logout(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SMISApplication.class.getResource("SMIS.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 670, 440);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Forgot Password");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void HaveAcc(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SMISApplication.class.getResource("SMIS.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 670, 440);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(scene);
        stage.show();
    }
}
