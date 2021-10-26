package com.kodilla.abstracts.homework;

public class Square extends Shape{

    public Square(){
        super(3,3,3,3.14);


    }

    public void calculatePole(int firstSide, int secondSide) {
        int pole = firstSide * secondSide;
        System.out.println(pole);
    }

    @Override
    public void calculateObwod(int firstSide) {
        int obwod = 4*firstSide;
        System.out.println(obwod);
    }
}
