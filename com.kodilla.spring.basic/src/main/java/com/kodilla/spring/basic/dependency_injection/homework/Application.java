package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {

        DeliveryService deliveryServiceDomestic = new DomesticDeliveryService();
        DeliveryService deliveryServiceInternational = new InternationalDelivery();
        NotificationService notificationService = new NotificationService();

        ShippingCenter shippingCenterLocal = new ShippingCenter(deliveryServiceDomestic, notificationService);
        ShippingCenter shippingCenterWorld = new ShippingCenter(deliveryServiceInternational, notificationService);



        shippingCenterLocal.sendPackage("Marszałkowska 1", 20);
        shippingCenterWorld.sendPackage("Hill Street 11, New York", 20);
    }
}
