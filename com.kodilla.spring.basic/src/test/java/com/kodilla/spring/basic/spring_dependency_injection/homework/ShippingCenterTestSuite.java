package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependency_injection.SkypeMessageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void checkPackageDelivery() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        DeliveryService bean = context.getBean(DeliveryService.class);
        Boolean message = bean.deliverPackage("New York", 1.00);
        Assertions.assertTrue(message);
    }
    @Test
    public void checkNotification(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.success("Warsaw");
        Assertions.assertEquals("Package delivered to: Warsaw", message);
    }
    @Test
    public void checkSuccessSendingMessage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Warsaw", 4.44);
        assertEquals("Package delivered to: Warsaw", message);
    }
    @Test
    public void checkFailSendingMessage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Warsaw", 33.44);
        assertEquals("Package not delivered to: Warsaw", message);
    }




}