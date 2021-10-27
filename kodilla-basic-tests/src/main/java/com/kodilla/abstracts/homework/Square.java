
package com.kodilla.abstracts.homework;

public class Square extends Shape{

    private int firstSide;


    public  Square(int firstSide){
        this.firstSide = firstSide;

    }


    @Override
    public void calculatePole() {
        int pole = firstSide*firstSide;
        System.out.println("Pole kwadratu " +pole);

    }

    @Override
    public void calculateObwod() {
        int obwod = 4*firstSide;
        System.out.println("Obwód kwadratu "+ obwod);

    }
}

