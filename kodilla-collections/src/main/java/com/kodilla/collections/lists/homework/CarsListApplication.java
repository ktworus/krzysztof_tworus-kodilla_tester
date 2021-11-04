package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Audi> audiModels = new ArrayList<>();

        Audi a80 = new Audi(50, 10, 10);
        Audi a100 = new Audi(70, 20, 20);
        Audi quattro = new Audi(100, 50, 20);
        audiModels.add(a80);
        audiModels.add(a100);
        audiModels.add(quattro);
        System.out.println("-----------------------------");
        System.out.println("Liczba aut w kolekcji "+audiModels.size());
        for (Car audi : audiModels) {
            CarUtils.describeCar(audi);
        }
        audiModels.remove(0);
        audiModels.remove(a100);
        System.out.println("-----------------------------");
        System.out.println("Liczba aut w kolekcji "+audiModels.size());
        for (Car audi : audiModels) {
            CarUtils.describeCar(audi);

        }


    }
    }



