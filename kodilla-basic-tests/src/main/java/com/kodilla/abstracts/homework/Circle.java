package com.kodilla.abstracts.homework;

public class Circle extends Shape{
    public Circle(){
        super(0,0,5,3.14);
    }
    @Override
    public void calculatePole() {
        double pole = getPI() * getR()*getR();
        System.out.println("Pole okręgu " + pole);
    }

    @Override
    public void calculateObwod() {
        double obwod = 2* getPI()*getR();
        System.out.println("Obwod okręgu " + obwod);

    }
}
