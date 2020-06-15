package com.stormnet.calculator;

public class Calculator {

    public double addUpTheNumbers(double a, double b) {

        double result = a + b;
        System.out.println("Addition result: " + result);

        return result;
    }

    public double divideTheNumbers(double a, double b) {

        double result = a / b;
        System.out.println("Division result: " + result);

        return result;
    }

    public double multiplyNumbers(double a, double b) {

        double result = a * b;
        System.out.println("Multiply result: " + result);

        return result;
    }

    public double subtraction(double a, double b) {
        double result = a - b;
        System.out.println("Subtraction result " + result);

        return result;
    }

    public double exponentiation(double a, double b) {

        double result = Math.pow(a, b);
        System.out.println("Exponentiation result: " + result);

        return result;
    }
}
