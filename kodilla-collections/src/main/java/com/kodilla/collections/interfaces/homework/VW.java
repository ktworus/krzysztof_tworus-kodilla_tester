package com.kodilla.collections.interfaces.homework;

public class VW implements Car{
    private int speed;
    private int speedIncrease;
    private int speedDecrease;

    public VW(int speed, int speedIncrease, int speedDecrease){
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
        speedIncrease = 30;
        speed = speed+speedIncrease;

    }

    @Override
    public void decreaseSpeed() {
        speedDecrease = 1;
        speed = speed-speedDecrease;
    }
}

