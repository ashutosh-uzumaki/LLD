package org.example.ocp.good_code;

public class EmailNotification implements Notification{
    @Override
    public void sendMessage(String message){
        System.out.println("Sending Email Notification: "+message);
    }
}
