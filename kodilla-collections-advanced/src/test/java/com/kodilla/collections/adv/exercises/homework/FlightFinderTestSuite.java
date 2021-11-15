package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void findFlightsFromChecker() {
        FlightFinder flightFinder = new FlightFinder();
        int result;
        result = flightFinder.findFlightsFrom("CPH").size();
        assertEquals(2,result);
    }

    @Test
    void findFlightsToChecker() {
        FlightFinder flightFinder = new FlightFinder();
        int result;
        result = flightFinder.findFlightsTo("CPH").size();
        assertEquals(2,result);
    }
    @Test
    void findFlightsFromNames(){
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("CPH");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("CPH", "WAW"));
        expectedList.add(new Flight("CPH", "LON"));
        assertEquals(expectedList,result);

    }
}