package org.example.design_patterns.creational.factory.factory;

public class EmailNotifier implements Notifier{
    @Override
    public void send(String recpient, String message){
        System.out.println("Message has been sent to: "+recpient);
    }
}
