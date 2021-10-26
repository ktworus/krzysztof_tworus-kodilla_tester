package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int firstSide;
    private int secondSide;
    private int r;
    private double PI;

    public Shape(int firstSide, int secondSide, int r, double PI ) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.r = r;
        this.PI = PI;

    }

    public abstract void calculatePole();
    public abstract void calculateObwod();




}
