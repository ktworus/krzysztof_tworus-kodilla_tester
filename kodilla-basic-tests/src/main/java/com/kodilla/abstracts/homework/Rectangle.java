package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
   private int firstSide;
   private int secondSide;

    public  Rectangle(int firstSide, int secondSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }



    @Override
    public void calculatePole() {
    int pole = firstSide*secondSide;
        System.out.println("Pole prostokąta " + pole);

    }

    @Override
    public void calculateObwod() {
        int obwod = 2* firstSide+2*secondSide;
        System.out.println("Obwód prostokąta " + obwod);

    }
}
