package com.example.temperature;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureTest {

    @Test
    public void testCelsiusToFahrenheit() {
        // Create a Celsius instance with a sample temperature
        Celsius celsius = new Celsius(25.0);
        double expectedFahrenheit = 77.0;

        // Assert that the conversion is correct
        assertEquals(expectedFahrenheit, celsius.toFahrenheit(), 0.01, "Celsius to Fahrenheit conversion failed");
    }

    @Test
    public void testFahrenheitToCelsius() {
        // Create a Fahrenheit instance with a sample temperature
        Fahrenheit fahrenheit = new Fahrenheit(77.0);
        double expectedCelsius = 25.0;

        // Assert that the conversion is correct
        assertEquals(expectedCelsius, fahrenheit.toCelsius(), 0.01, "Fahrenheit to Celsius conversion failed");
    }
}
