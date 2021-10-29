package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    private String responsibilities;


    public Job(int salary, String responsibilities) {
        this.responsibilities = responsibilities;
        this.salary = salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }
}