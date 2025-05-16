package com.lug;

import com.lug.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(4, 7));
        System.out.println("Division: " + calculator.divide(10, 2));
        System.out.println("Power: " + calculator.power(2, 5));
        System.out.println("Square Root: " + calculator.squareRoot(16));
        System.out.println("Factorial: " + calculator.factorial(5));
    }
}