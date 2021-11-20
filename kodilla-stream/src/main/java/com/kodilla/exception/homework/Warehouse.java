package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {


    public static void addOrder(Order order) {
        List orders = new ArrayList<>();
    }






        public Order getOrder (String number) {
        Order selectedOrder = WarehouseApp.getorders()
           .stream()
                .filter(u->u.equals(getOrder(number)))
                .map(u->u.getNumber())





        return selectedOrder;
        }
    }
}