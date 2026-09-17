package org.example.design_patterns.creational.factory.bad;

public class EmailNotification {
    public void sendNotification(String recepient, String message){
        System.out.println("Mail sent to: "+recepient);
    }
}
