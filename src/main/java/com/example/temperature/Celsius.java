package com.example.temperature;

public class Celsius {
    private double value;

    public Celsius(double value) {
        this.value = value;
    }

    // Convert Celsius to Fahrenheit
    public double toFahrenheit() {
        return (value * 9 / 5) + 32;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

