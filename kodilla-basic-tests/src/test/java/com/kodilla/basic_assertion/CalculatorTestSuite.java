package com.kodilla.basic_assertion;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;



public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 58;
        double b = 8;
        double sumResult = calculator.sum(a, b);
        assertEquals(69, sumResult,0);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        double a = 10;
        double b = 8;
        double subtractResult = calculator.subtract(a, b);
        assertEquals(4, subtractResult,0);


    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        double a = 5.11;

        double squareResult = calculator.square(a);


        assertEquals(27.11,squareResult, 1);
    }
}