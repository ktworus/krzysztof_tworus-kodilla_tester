
package com.kodilla.abstracts.homework;

public class Circle extends Shape{
    private int r;
    private double PI;


    public  Circle(int r, double PI){
        this.r = r;
        this.PI = PI;

    }


    @Override
    public void calculatePole() {
        double pole = PI*r*r;
        System.out.println("Pole okręgu " + pole);
    }

    @Override
    public void calculateObwod() {
        double obwod = 2* PI*r;
        System.out.println("Obwod okręgu " + obwod);

    }
}

