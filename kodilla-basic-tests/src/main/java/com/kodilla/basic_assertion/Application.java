package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 5;
        int sumResult = calculator.sum(a, b);
        int subtractResult = calculator.subtract(a, b);
        double squareResult = calculator.square(a);
        double expectedSquare = 65;

       boolean correct = ResultChecker.assertEquals(13, sumResult,0);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        correct = ResultChecker.assertEquals(3, subtractResult,0);
        if (correct) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }
        correct = ResultChecker.assertEquals(expectedSquare, squareResult,0);
        if (correct) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a );
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a );
        }

    }
}
