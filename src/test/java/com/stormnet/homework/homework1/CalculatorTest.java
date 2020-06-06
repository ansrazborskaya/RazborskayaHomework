package com.stormnet.homework.homework1;

import com.stormnet.calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public void init() {
        calculator = new Calculator();
        System.out.println("Calculator testing started!");
    }

    @Test
    public void sum_10_plus_5() {

        double expectedResult = 15;
        double actualResult = calculator.addUpTheNumbers(10, 5);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void divide_8_by2() {

        double expectedResult = 4;
        double actualResult = calculator.divideTheNumbers(8, 2);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void multiply_22_by_4Double(){

        double expectedResult = 99;
        double actualResult = calculator.multiplyNumbers(22,4.5);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void subtraction_40double_minus_7double(){

        double expectedResult = 32.78;
        double actualResult = calculator.subtraction(40.77,7.99);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void exponentiation_4_pow_3(){

        double expectedResult = 64;
        double actualResult = calculator.exponentiation(4,3);
        Assert.assertEquals(expectedResult, actualResult);

    }
}
