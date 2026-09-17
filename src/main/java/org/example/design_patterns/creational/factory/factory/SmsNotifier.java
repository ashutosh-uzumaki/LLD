package org.example.design_patterns.creational.factory.factory;

public class SmsNotifier implements Notifier{
    @Override
    public void send(String recepient, String message){
        System.out.println("Sms sent to the recepient: "+ recepient);
    }
}
