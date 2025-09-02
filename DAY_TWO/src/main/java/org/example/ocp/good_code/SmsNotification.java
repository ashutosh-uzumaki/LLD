package org.example.ocp.good_code;

public class SmsNotification implements Notification{
    @Override
    public void sendMessage(String message){
        System.out.println("Sending sms notification: "+message);
    }
}
