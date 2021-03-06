package com.kodilla.collections.interfaces.homework;

public class Audi implements Car{
    private int speed;
    private int speedIncrease;
    private int speedDecrease;

    public Audi(int speed, int speedIncrease, int speedDecrease){
        this.speed = speed;
        this.speedIncrease = speedIncrease;
        this.speedDecrease = speedDecrease;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed+speedIncrease;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed-speedDecrease;
    }
}
