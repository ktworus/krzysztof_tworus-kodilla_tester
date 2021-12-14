package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public interface Car {

    default boolean hasHeadlightsTurnedOn() {
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.parse("20:00")) || time.isBefore(LocalTime.parse("06:00"))) {
            System.out.println("Lights on " + time);
            return true;
        } else {
            System.out.println("Lights off "+time);
            return false;
        }
    }
    String getCarType ();
}