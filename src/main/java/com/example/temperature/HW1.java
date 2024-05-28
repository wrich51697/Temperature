package com.example.temperature;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class HW1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HW1.class.getResource("fxml_temperature.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 800);

        // Load and apply the CSS file
        String css = Objects.requireNonNull(HW1.class.getResource("styles.css")).toExternalForm();
        scene.getStylesheets().add(css);

        // Set up the scene and stage
        primaryStage.setTitle("Temperature Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

