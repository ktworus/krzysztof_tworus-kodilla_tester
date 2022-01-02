package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Date;


public class Order {
    double orderValue;
    String login;
    LocalDate orderDate;

    public Order(double orderValue, LocalDate orderDate, String login){
        this.orderValue = orderValue;
        this.login = login;
        this.orderDate = orderDate;

    }
        public double getOrderValue() {
            return orderValue;
        }
        public String getLogin() {
            return login;
        }
        public LocalDate getLocalDate() {
              return orderDate;
    }
    @Override
    public String toString() {
        return "Order{" +
                "value='" + orderValue + '\'' +
                ", date=" + orderDate +
                "login" + login +
                '}';
    }
}
