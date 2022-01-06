package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.Animal;
import com.kodilla.spring.basic.spring_configuration.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CarConfigTestSuite {
    @Test
    public void shouldCreateSUV() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        SUV suv = (SUV) context.getBean("createSUV");
        //When
        String carType = suv.getCarType();
        //Then
        Assertions.assertEquals("SUV", carType);
    }
    @Test
    public void shouldCreateRandomCar() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("selectCar");
        //When
        String carType = car.getCarType();

        //Then
        List<String> possibleTypes = Arrays.asList("SUV", "Sedan", "Cabrio");
        Assertions.assertTrue(possibleTypes.contains(carType));
    }
   @Test
    public void checkLightsStatusDay() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("selectCar");
        //When
        boolean lightsOn = car.hasHeadlightsTurnedOn();

        //Then

        Assertions.assertFalse(lightsOn);
    }
}
