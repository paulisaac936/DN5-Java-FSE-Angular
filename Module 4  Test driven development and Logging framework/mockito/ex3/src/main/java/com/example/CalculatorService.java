package com.example;

public class CalculatorService {

    private Calculator calculator;

    public CalculatorService(
            Calculator calculator) {

        this.calculator = calculator;
    }

    public int calculate() {

        return calculator.add(10, 20);
    }
}