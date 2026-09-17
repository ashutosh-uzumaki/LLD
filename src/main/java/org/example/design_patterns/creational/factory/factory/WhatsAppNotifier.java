package org.example.design_patterns.creational.factory.factory;

public class WhatsAppNotifier implements Notifier{
    @Override
    public void send(String recepient, String message){
        System.out.println("Whatsapp has been sent to: "+recepient);
    }
}
