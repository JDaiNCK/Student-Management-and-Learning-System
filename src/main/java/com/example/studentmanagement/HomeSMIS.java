package com.example.studentmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import java.io.IOException;

public class HomeSMIS {

    @FXML
    public void Logout(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationSMIS.class.getResource("SMIS.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void SubEnroll(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationSMIS.class.getResource("SMISSubsEnrolled.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 670, 440);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Subjects Enrolled");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void Performance(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationSMIS.class.getResource("SMISPerformance.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 670, 440);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Performance");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void Admissions(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationSMIS.class.getResource("SMISAdmissions.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("School's Admissions");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void Messages(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationSMIS.class.getResource(""));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Chat");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void BackHome(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationSMIS.class.getResource("SMISHome.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(scene);
        stage.show();
    }
}
