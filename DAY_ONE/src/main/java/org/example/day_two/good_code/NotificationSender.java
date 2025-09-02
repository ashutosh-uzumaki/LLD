package org.example.day_two.good_code;

import java.util.*;

public class NotificationSender {
    public void sendNotifications(List<String> notificationTypes, String message){
        for(String notificationType: notificationTypes) {
            switch (notificationType) {
                case "SMS":
                    SmsNotification smsNotification = new SmsNotification();
                    smsNotification.sendSmsNotification(message);
                    break;
                case "EMAIL":
                    EmailNotification emailNotification = new EmailNotification();
                    emailNotification.sendEmailNotification(message);
                    break;
                case "PUSH":
                    PushNotification pushNotification = new PushNotification();
                    pushNotification.sendPushNotification(message);
                    break;
                case "WHATSAPP":
                    WhatsAppNotification whatsAppNotification = new WhatsAppNotification();
                    whatsAppNotification.sendWhatsAppNotification(message);
            }
        }
    }
}

//STILL THIS CODES DOES MULTIPLE WORK (SMS, EMAIL, PUSH, WHATSAPP)
