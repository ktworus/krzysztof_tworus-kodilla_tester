package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car{


    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.parse("20:00")) && time.isBefore(LocalTime.parse("06:00")) ){
            System.out.println("Lights on");
            return true;
        }
        else{
            return false;
        }

    }
    @Override
    public String getCarType() {
        return "SUV";
    }
}
