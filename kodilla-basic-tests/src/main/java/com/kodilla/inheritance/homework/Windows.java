package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem{
    public Windows(int year) {
        super(year);
        System.out.println("Windows constructor");
    }
    @Override
    public void turnOn() {
        System.out.println("System in BETA");
    }
    @Override
    public void turnOff(){
        System.out.println("BSOD");
    }
}
