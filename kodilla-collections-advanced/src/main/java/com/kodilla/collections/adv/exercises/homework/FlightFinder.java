package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.*;

public class FlightFinder {

    public  List<Flight> findFlightsFrom(String departure){

    List <Flight> result = new ArrayList<>();
    for(Flight flight: FlightRepository.getFlightsTable()){
        if(flight.departure==departure){
                result.add(flight);}
        }
    return result;

    }
    public List<Flight> findFlightsTo(String arrival) {
        List <Flight> result = new ArrayList<>();
        for(Flight flight: FlightRepository.getFlightsTable()){
            if(flight.arrival==arrival){
                result.add(flight);}
        }
    return result;
    }
}
