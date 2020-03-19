package com.cursor.main.java.hw9.task2;

import java.util.Scanner;

public class SafeDivision {
    private double firstNumber;
    private double secondNumber;
    private Scanner scanner = new Scanner(System.in);

    public void runProgram() {
        inputFirstNumber();
        inputSecondNumber();
        divide();
    }

    public void inputFirstNumber() {
        System.out.println("Enter the first number: ");
        firstNumber = scanner.nextDouble();
    }

    public void inputSecondNumber() {
        System.out.println("Enter the second number: ");
        secondNumber = scanner.nextDouble();
    }

    public void divide() {
        double result;
        try {
            result = firstNumber / secondNumber;
            System.out.println("Result: " + result);
            if (result == Double.POSITIVE_INFINITY ||
                    result == Double.NEGATIVE_INFINITY) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("You shouldn't divide by zero.");
            inputSecondNumber();
            divide();
        } finally {
            scanner.close();
        }
    }
}
