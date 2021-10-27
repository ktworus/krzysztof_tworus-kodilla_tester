package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    public Rectangle(){
        super(4,5,0, 0);

    }


    @Override
    public void calculatePole() {
    int pole = getFirstSide()*getSecondSide();
        System.out.println("Pole prostokąta " + pole);

    }

    @Override
    public void calculateObwod() {
        int obwod = 2* getFirstSide()+2*getSecondSide();
        System.out.println("Obwód prostokąta " + obwod);

    }
}
