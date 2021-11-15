package com.kodilla.collections.adv.exercises.homework;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class FlightRepository {


    public static List<Flight> getFlightsTable() {
        List<Flight> flightsTable = new ArrayList<>();

        flightsTable.add(new Flight("CPH", "WAW"));
        flightsTable.add(new Flight("CPH", "LON"));
        flightsTable.add(new Flight("LON", "WAW"));
        flightsTable.add(new Flight("LON", "CPH"));
        flightsTable.add(new Flight("WAW", "LON"));
        flightsTable.add(new Flight("WAW", "CPH"));

        return flightsTable;

    }
}




