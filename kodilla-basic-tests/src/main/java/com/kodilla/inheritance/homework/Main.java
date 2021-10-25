package com.kodilla.inheritance.homework;

public class Main {
    public static void main(String[] args) {
        IOS ios = new IOS(1976);
        ios.turnOn();
        ios.turnOff();
        Windows windows = new Windows(1980);
        windows.turnOn();
        windows.turnOff();
        OperatingSystem operatingSystem = new OperatingSystem(1900);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
    }


}
