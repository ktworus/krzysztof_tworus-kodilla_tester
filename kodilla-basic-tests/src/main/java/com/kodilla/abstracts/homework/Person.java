package com.kodilla.abstracts.homework;

public class Person {
    public static void main(String[] args) {

        Job pilot = new Pilot();
        Job nurse = new Nurse();
        Job driver = new Driver();

        Person James = new Person("James", 33, pilot);
        System.out.println(James.firstName + " " +pilot.getResponsibilities());
        Person Anna = new Person("Anna", 55, nurse);
        System.out.println(Anna.firstName+" " + nurse.getResponsibilities());
        Person Bob = new Person("Bob", 44, driver);
        System.out.println(Bob.firstName +" " + driver.getResponsibilities());

    }
    String firstName;
    int age;
    Job job;

    public Person(String firstName, int age, Job job){
            this.firstName = firstName;
            this.age = age;
            this.job = job;
        }
    }







