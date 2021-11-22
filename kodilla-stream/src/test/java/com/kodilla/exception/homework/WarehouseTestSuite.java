package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testExistingOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));

        //when
        boolean isNumberOneExisting = warehouse.orders.contains(warehouse.getOrder("1"));
        //then
        assertTrue(isNumberOneExisting);
    }
    @Test
        public void testNonExistingOrder() {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("2"));

        assertThrows(OrderDoesntExistException.class, ()->warehouse.orders.contains(warehouse.getOrder("3")));
        }

}
