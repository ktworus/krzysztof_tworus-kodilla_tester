package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int firstSide;
    private int secondSide;
    private int r;
    private final double PI;

    public Shape(int firstSide, int secondSide, int r, double PI ) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.r = r;
        this.PI = PI;

    }
    public int getFirstSide(){
        return firstSide;
    }
    public int getSecondSide(){
        return secondSide;
    }

    public int getR() {
        return r;
    }

    public double getPI() {
        return PI;
    }

    public abstract void calculatePole();
    public abstract void calculateObwod();




}
