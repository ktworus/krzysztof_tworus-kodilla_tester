package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {


        Square square = new Square(7);
        square.calculateObwod();
        square.calculatePole();

        Circle circle = new Circle(3, 3.14);
        circle.calculateObwod();
        circle.calculatePole();

       Rectangle rectangle = new Rectangle(4,5);
       rectangle.calculateObwod();
       rectangle.calculatePole();











    }
}
