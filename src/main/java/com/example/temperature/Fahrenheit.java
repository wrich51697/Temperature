package com.example.temperature;

public class Fahrenheit {
    private double value;

    public Fahrenheit(double value) {
        this.value = value;
    }

    // Convert Fahrenheit to Celsius
    public double toCelsius() {
        return (value - 32) * 5 / 9;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

