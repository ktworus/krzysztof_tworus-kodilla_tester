package com.kodilla.abstracts;

public class Dog extends Animal{
    public Dog() {
        super(4);
    }

    @Override
    public void giveVoice() {
        String dogVoice = "HAU HAU";
        System.out.println(dogVoice);

    }
}
