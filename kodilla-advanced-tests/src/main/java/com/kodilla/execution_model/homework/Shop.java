package com.kodilla.execution_model.homework;

import com.kodilla.execution_model.Item;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Shop {

    private List<Order> orderList = new ArrayList<>();

    LocalDate startDate;
    LocalDate endDate;

    public void addOrder(Order order) {
        this.orderList.add(order);
    }
    public List<Order> getOrdersByValue(double minValue, double maxValue){
       List<Order> ordersValue = new ArrayList<>();
            for (Order order:orderList
                 ) {
                if(minValue <= order.getOrderValue() && order.getOrderValue() <=maxValue){
                    ordersValue.add(order);
                }
            }
            return ordersValue;
            }
    public List<Order> getOrdersByDate(LocalDate startDate, LocalDate endDate){
        List<Order> ordersDate = new ArrayList<>();
        for (Order order:orderList
        ) {
            if(startDate.isBefore(order.getLocalDate()) && endDate.isAfter(order.getLocalDate())){
                ordersDate.add(order);
            }
        }
        return ordersDate;
    }
    public int getOrderCount(){
        return orderList.size();
    }
    public double getOrderSum(){
        double sum = 0;
        for (Order order:orderList
             ) {sum=sum+order.orderValue;

        }
        return sum;
    }

    public void clear() {
        this.orderList.clear();
    }

    public int getSize() {
        return this.orderList.size();

    }
}