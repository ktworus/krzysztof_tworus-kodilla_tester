package com.kodilla.abstracts.homework;

public class Person {
    public static void main(String[] args) {
        Person James = new Person("James", 33, "Pilot");
        Person Anna = new Person("Anna", 55, "nurse");
        Person Bob = new Person("Bob", 44, "Driver");

        Nurse nurse = new Nurse();
        Driver driver = new Driver();
        Pilot pilot = new Pilot();

        System.out.println(Anna.firstName +" "+ nurse.getResponsibilities());
        System.out.println(Bob.firstName+" "+driver.getResponsibilities());
        System.out.println(James.firstName+" "+pilot.getResponsibilities());




    }

    String firstName;
    int age;
    String job;

    public Person(String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }


    }




