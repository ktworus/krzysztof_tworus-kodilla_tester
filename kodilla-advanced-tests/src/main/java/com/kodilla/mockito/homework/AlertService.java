package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;



public class AlertService {

    private Subscriber subscriber;

    private Map<Location, Subscriber> Subscriptions = new HashMap<>();

    public void addSubscriber(Location location, Subscriber subscriber) {
        this.Subscriptions.put(location, subscriber);
    }
    public void sendAlert() {
        this.Subscriptions.forEach((Location, Subscriber) ->Subscriber.receiveAlert());
    }
    public void sendAlertForSpecificLocation(Location location) {
        this.Subscriptions.forEach((Location, Subscriber) -> Subscriber.receiveAlertPerLocation(location));
    }
    public void removeSubscriberFromLocation(Location location, Subscriber subscriber) {
        this.Subscriptions.remove(location, subscriber);
    }


    public void deleteLocation(Location location){
        this.Subscriptions.keySet().remove(location);
    }

    public int getAlertsSize(){
        return Subscriptions.size();
    }

}