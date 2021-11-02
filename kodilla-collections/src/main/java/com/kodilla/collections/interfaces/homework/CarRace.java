package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
    Audi audi = new Audi(70, 10,5);
    BMW bmw = new BMW(70, 20,5);
    VW vw = new VW(70,30,5);
        System.out.println("Audi");
        doRace(audi);
        System.out.println("Bmw");
        doRace(bmw);
        System.out.println("Vw");
        doRace(vw);


    }
    public static void doRace(Car car) {
        System.out.println(car.getSpeed());
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());


    }
}
