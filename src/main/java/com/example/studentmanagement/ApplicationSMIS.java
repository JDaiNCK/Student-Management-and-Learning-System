package com.example.studentmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationSMIS extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationSMIS.class.getResource("SMIS.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 480);
        scene.getStylesheets().add(ApplicationSMIS.class.getResource("SMISstyle.css").toExternalForm());
        stage.setTitle("Student Management and Information System");
        stage.setScene(scene);
        stage.show();
    }
}
