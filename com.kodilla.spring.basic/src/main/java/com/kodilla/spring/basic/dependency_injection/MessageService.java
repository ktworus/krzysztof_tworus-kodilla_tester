package com.kodilla.spring.basic.dependency_injection;

public interface MessageService {

    void send(String message, String receiver);



   /* MessageService messageService = new MessageService();
    SimpleApplication application = new SimpleApplication(messageService);
    application.processMessage("Test message", "receiver@mail.com");

    public void send(String message, String receiver) {
        System.out.println("Sending message [" + message + "] to: " + receiver);
    }*/
}

