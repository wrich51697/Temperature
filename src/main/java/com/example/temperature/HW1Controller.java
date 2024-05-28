package com.example.temperature;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HW1Controller {

    @FXML
    private TextField inputField;

    @FXML
    private Button btnFToC;

    @FXML
    private Button btnCToF;

    @FXML
    private Label resultLabel;

    @FXML
    private void initialize() {
        btnFToC.setOnAction(e -> {
            try {
                double fahrenheit = Double.parseDouble(inputField.getText());
                Fahrenheit f = new Fahrenheit(fahrenheit);
                double celsius = f.toCelsius();
                resultLabel.setText(String.format("%.2f °F = %.2f °C", fahrenheit, celsius));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input. Please enter a valid number.");
            } catch (Exception ex) {
                resultLabel.setText("An error occurred: " + ex.getMessage());
            }
        });

        btnCToF.setOnAction(e -> {
            try {
                double celsius = Double.parseDouble(inputField.getText());
                Celsius c = new Celsius(celsius);
                double fahrenheit = c.toFahrenheit();
                resultLabel.setText(String.format("%.2f °C = %.2f °F", celsius, fahrenheit));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input. Please enter a valid number.");
            } catch (Exception ex) {
                resultLabel.setText("An error occurred: " + ex.getMessage());
            }
        });
    }
}

