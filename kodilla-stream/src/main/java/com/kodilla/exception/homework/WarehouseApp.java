package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Order order = new Order;

    }
        public static List<Order> getorders() {
        List orders = new ArrayList<>();
        Warehouse.addOrder(new Order("1"));
        Warehouse.addOrder(new Order("2"));
        Warehouse.addOrder(new Order("3"));
        Warehouse.addOrder(new Order("4"));
        Warehouse.addOrder(new Order("5"));
        return orders;
    }
}
