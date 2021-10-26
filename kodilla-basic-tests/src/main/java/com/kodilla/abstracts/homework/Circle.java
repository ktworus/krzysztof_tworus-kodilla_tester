package com.kodilla.abstracts.homework;

publicclass Circle extends Shape{
    public Circle(){
        super(2,2,2,2);
    }
    @Override
    public void calculatePole(double PI, int r) {

        double pole = PI * r^2;
        System.out.println(pole);
    }

    @Override
    public void calculateObwod(int r, double PI) {

    }
}
