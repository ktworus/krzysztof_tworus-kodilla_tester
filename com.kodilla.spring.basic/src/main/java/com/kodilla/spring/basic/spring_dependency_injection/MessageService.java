package com.kodilla.spring.basic.spring_dependency_injection;

public class MessageService {

    public void send(String message, String receiver) {
        System.out.println("Sending message [" + message + "] to: " + receiver);
    }
}
