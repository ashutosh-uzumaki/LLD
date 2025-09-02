package org.example.ocp.good_code;

public class PushNotification implements Notification{
    @Override
    public void sendMessage(String message){
        System.out.println("Sending push notification: "+message);
    }
}
