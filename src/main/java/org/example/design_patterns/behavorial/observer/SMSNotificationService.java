package org.example.design_patterns.behavorial.observer;

public class SMSNotificationService implements NotificationService{
    @Override
    public void send(String recepient, String message){
        System.out.println("Message sent!");
    }
}
