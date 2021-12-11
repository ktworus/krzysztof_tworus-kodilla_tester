package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalTime;
import java.util.Random;

@Configuration
public class CarConfig {
    private Car car;
    @Bean
    public SUV createSUV() {
        return new SUV();
    }

    @Bean
    public Car selectCar() {
        Car car;
        Random random = new Random();
        int season = random.nextInt(4);

        if (season == 1) {
            System.out.println("Autumn");
            car = new Sedan();
        } else if (season == 2) {
            System.out.println("Winter");
            car = new SUV();
        } else if (season == 3) {
            System.out.println("Summer");
            car = new Cabrio();
        } else {
            System.out.println("Spring");
            car = new Sedan();
        }
        return car;
    }
    /*@Bean
    public boolean hasLightsOn() {
        return car.hasHeadlightsTurnedOn();
    }*/
}
