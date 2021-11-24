package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {


     List<Order> orders = new ArrayList<>();

    public  void addOrder(Order order) {
        orders.add(order);


    }

    public  Order getOrder(String number) throws OrderDoesntExistException {

      List <Order> selectedOrder = orders
               .stream()
               .filter(u->u.getNumber().equals(number))
               /*.findAny().orElseThrow(()->new OrderDoesntExistException());*/
               .collect(Collectors.toList());
               if(selectedOrder.isEmpty()){
                   throw new OrderDoesntExistException();
               }


        return selectedOrder.get(0);
    }
}
