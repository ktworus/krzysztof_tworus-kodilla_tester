package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void shouldReturnAddResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double addResult = bean.add(2, 3);
        Assertions.assertEquals(5,addResult);
    }
    @Test
    public void shouldReturnSubtractResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double subResult = bean.subtract(3, 2);
        Assertions.assertEquals(1,subResult);
    }
    @Test
    public void shouldReturnMultiplyResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double multResult = bean.multiply(3, 2);
        Assertions.assertEquals(6,multResult);
    }
    @Test
    public void shouldReturnDivideResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double divResult = bean.divide(4, 2);
        Assertions.assertEquals(2,divResult);
    }

}
