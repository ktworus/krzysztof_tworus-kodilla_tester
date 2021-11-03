package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.VW;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        int i = drawSize();
        Car[] cars = new Car[i];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();

        for ( Car car : cars) {
            CarUtils.describeCar(car);

        }
    }
    public static int drawSize(){
        Random random = new Random();
        int tableSize = random.nextInt(15);
                return tableSize;
    }
    public static Car drawCar(){
        Random random = new Random();
        int drawnCars = random.nextInt(3);
        int extraSpeed = random.nextInt(100);

        if (drawnCars == 0)

            return new Audi(70 + extraSpeed,10, 2);
        else if (drawnCars == 1)
            return new BMW(70+ extraSpeed,20,2);
        else
            return new VW(70+ extraSpeed,30,2);
    }
}


