package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> directors = new HashMap<>();
        Principal john = new Principal("John", "Wayne");
        Principal jessie = new Principal("Jessie", "James");
        Principal burt = new Principal("Burt", "Reynolds");

        School firstSchool = new School("First",31,24,55);
        School secondSchool = new School("Second",20,30,40);
        School thirdSchool = new School("Third",200,300);

        directors.put(john, firstSchool);
        directors.put(jessie,secondSchool);
        directors.put(burt, thirdSchool);

        for (Map.Entry<Principal, School> directorsEntry : directors.entrySet())
            System.out.println(directorsEntry.getKey().getLastname() +" - "+ directorsEntry.getValue().toString()+", students: " +
                    directorsEntry.getValue().getSum());

    }
}
