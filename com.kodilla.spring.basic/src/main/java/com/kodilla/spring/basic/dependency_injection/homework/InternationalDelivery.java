package com.kodilla.spring.basic.dependency_injection.homework;

public class InternationalDelivery implements DeliveryService{

        @Override
        public boolean deliverPackage(String address, double weight) {
            if (weight > 10) {
                System.out.println("Package too heavy");
                return false;
            }
            System.out.println("International delivering in progress...");
            return true;
        }
    }

