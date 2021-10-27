package com.kodilla.abstracts.homework;

public class Square extends Shape{

    public Square(){
        super(4,4,0,0);


    }


    @Override
    public void calculatePole() {
        int pole = getFirstSide()*getFirstSide();
        System.out.println("Pole kwadratu " +pole);

    }

    @Override
    public void calculateObwod() {
        int obwod = 4*getFirstSide();
        System.out.println("Obwód kwadratu "+ obwod);

    }
}
