package com.kodilla.mockito.homework;

import com.kodilla.mockito.Client;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlertServiceTestSuite {
    AlertService alertService = new AlertService();
    Subscriber firstSubscriber = Mockito.mock(Subscriber.class);
    Subscriber secondSubscriber = Mockito.mock(Subscriber.class);
    Location firstLocation = Mockito.mock(Location.class);
    Location secondLocation = Mockito.mock((Location.class));


    @Test
    public void notSubscribedShouldNotReceiveAlert() {
        alertService.addSubscriber(firstLocation, firstSubscriber);
        alertService.addSubscriber(secondLocation, secondSubscriber);
        alertService.sendAlertForSpecificLocation(firstLocation);
        Mockito.verify(firstSubscriber, Mockito.times(1)).receiveAlertPerLocation(firstLocation);
        Mockito.verify(secondSubscriber, Mockito.never()).receiveAlertPerLocation(secondLocation);
        System.out.println(alertService.getAlertsSize());
    }

    @Test
    public void subscribedShouldReceiveAlert() {

        alertService.addSubscriber(firstLocation, firstSubscriber);
        alertService.addSubscriber(secondLocation, secondSubscriber);
        alertService.sendAlert();
        System.out.println(alertService.getAlertsSize());
        Mockito.verify(firstSubscriber, Mockito.times(1)).receiveAlert();
        Mockito.verify(secondSubscriber, Mockito.times(1)).receiveAlert();
    }


    @Test
    public void deleteSubscriptionLocation() {
        alertService.addSubscriber(firstLocation, firstSubscriber);
        alertService.addSubscriber(secondLocation, firstSubscriber);

        alertService.removeSubscriberFromLocation(firstLocation, firstSubscriber);
        int activeLocations = alertService.getAlertsSize();
        System.out.println(activeLocations);
        assertEquals(1, activeLocations);
    }
    @Test
    public void deleteSubscriptionFromOneLocation(){
        alertService.addSubscriber(firstLocation, firstSubscriber);
        alertService.addSubscriber(secondLocation, firstSubscriber);

        alertService.removeSubscriberFromLocation(firstLocation, firstSubscriber);

        alertService.sendAlertForSpecificLocation(firstLocation);
        alertService.sendAlertForSpecificLocation(secondLocation);
        int activeLocations = alertService.getAlertsSize();
        assertEquals(1, activeLocations);
    }
    @Test
    public void deleteLocation(){
        alertService.addSubscriber(firstLocation, firstSubscriber);
        alertService.addSubscriber(secondLocation, firstSubscriber);

        alertService.deleteLocation(firstLocation);
        int activeLocations = alertService.getAlertsSize();
        assertEquals(1, activeLocations);

    }
}
