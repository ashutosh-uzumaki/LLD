package org.example.design_patterns.creational.factory.factory;

public class PushNotifier implements Notifier{
    @Override
    public void send(String recepient, String message){
        System.out.println("Push notification has been sent to the recepint: "+recepient);
    }
}
