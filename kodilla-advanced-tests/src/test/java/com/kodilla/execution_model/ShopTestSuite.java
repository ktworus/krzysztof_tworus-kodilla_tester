package com.kodilla.execution_model;

import com.kodilla.execution_model.homework.Order;
import com.kodilla.execution_model.homework.Shop;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ShopTestSuite {
    Shop shop = new Shop();
    Order order1 = new Order(44.55, LocalDate.of(2020, 12, 12), "john");
    Order order2 = new Order(25.55, LocalDate.of(2020,11,11),"james");
    Order order3 = new Order(20.9, LocalDate.of(2021,11,11),"jim");

    @Test
    public void shouldAddOrderToShop() {
        //When
        int numberOfOrders = shop.getSize();
        //Then
        assertEquals(3, numberOfOrders);
   }
    @Test
    public void shouldGetOrderBetweenDates() {
        //When
        int result = shop.getOrdersByDate(LocalDate.of(2020,01,01), LocalDate.of(2020,12,31)).size();

        //Then
        assertEquals(2,result );
    }

    @Test
    public void shouldReturnBetweenTwoValues() {
        //When
        int result = shop.getOrdersByValue(10, 30).size();

        //Then
        assertEquals(2,result );
    }
    @Test
    public void checkOrdersCount(){
        int result = shop.getOrderCount();

        assertEquals(3, result);
    }

   @Test
    public void shouldReturnOrdersSummaryValue() {
        //When
        double result = shop.getOrderSum();
       System.out.println(result);

        //Then
        assertEquals(91, result);
    }

        @Test
        public void shouldClearShop () {
            //When
            shop.clear();

            //Then
            assertEquals(0, shop.getSize());
        }

        @BeforeEach
        public void initializeShop () {
            shop.addOrder(order1);
            shop.addOrder(order2);
            shop.addOrder(order3);
        }

        @AfterEach
        public void resetValues () {
            System.out.println("Resetting values...");
        }

        @BeforeAll
        public static void displayIntroMessage () {
            System.out.println("Starting testing");
        }

        @AfterAll
        public static void displayGoodByeMessage () {
            System.out.println("Finishing testing");
        }

    }

