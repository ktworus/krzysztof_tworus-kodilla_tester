package com.kodilla.inheritance.homework;

public class IOS extends OperatingSystem {

    public IOS(int year) {
        super(year);
        System.out.println("IOS constructor");
    }


    @Override
    public void turnOn() {
        System.out.println("System unstable");
    }

    @Override
    public void turnOff() {
        System.out.println("Where is this button");
    }
}
