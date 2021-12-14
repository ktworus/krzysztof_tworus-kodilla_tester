package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car{
    @Override
    public boolean hasHeadlightsTurnedOn() {
        return Car.super.hasHeadlightsTurnedOn();

    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
