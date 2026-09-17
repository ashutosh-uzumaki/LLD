package org.example.design_patterns.creational.factory.bad;

public class NotificationService {
    public void sendNotification(ChannelType channelType, String recepient, String message){
        if(channelType.equals(ChannelType.EMAIL)){
            EmailNotification emailNotification = new EmailNotification();
            emailNotification.sendNotification(recepient, message);
        }else if(channelType.equals(ChannelType.WHATSAPP)){
            WhatsAppNotification whatsAppNotification = new WhatsAppNotification();
            whatsAppNotification.sendNotification(recepient, message);
        }
    }
}
