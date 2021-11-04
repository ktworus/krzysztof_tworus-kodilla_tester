package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.VW;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("-----------------------------");
        System.out.println("Car name: " + getCarName(car));
        System.out.println("Car speed: "+ car.getSpeed());



}

    private static String getCarName(Car car) {
        if (car instanceof Audi)
            return "Audi";
        else if (car instanceof BMW)
            return "BMW";
        else if (car instanceof VW)
            return "VW";
        else
            return "Unknown car name";

    }

}
