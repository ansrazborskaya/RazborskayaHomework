package com.stormnet.calculator;

public class CalculatorLaunch {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.exponentiation(5, 2);
        calculator.addUpTheNumbers(7, 7.5);
        calculator.divideTheNumbers(8, 2);
        calculator.multiplyNumbers(5.5, 2.9);
        calculator.subtraction(77.55, 20);

    }
}
