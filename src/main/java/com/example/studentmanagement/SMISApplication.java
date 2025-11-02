package com.example.studentmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SMISApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SMISApplication.class.getResource("SMIS.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 670, 440);
        stage.setTitle("Student Management and Information System");
        stage.setScene(scene);
        stage.show();
    }
}
