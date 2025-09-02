package org.example.ocp.bad_code;
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

//THE ABOVE CLASS IS CHANGED WHENEVER WE MODIFY BY ADDING A NEW TYPE OF NOTIFICATION OR REMOVING A TYPE
//OF NOTIFICATION.

//DOESN'T FOLLOW THE OPEN CLOSED PRINCIPLE
