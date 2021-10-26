package com.kodilla.inheritance.homework;



public class OperatingSystem {
    public OperatingSystem(int year){
        this.year = year;
        System.out.println("OS constructor");
    }
    private int year;
public void turnOn(){
    System.out.println("System on sale " +year);
}
public void turnOff(){
    System.out.println("System shut down " +year);

}
    }

