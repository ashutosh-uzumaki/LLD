package org.example.day_two.bad_code;

public enum NotificationType {
    SMS,
    EMAIL,
    WHATSAPP,
    PUSH;

    public void sendSMSNotification(String message){
        System.out.println("SMS: "+message);
    }
    public void sendWhatsAppNotification(String message){
        System.out.println("WhatsApp: "+message);
    }
    public void sendEmailNotification(String message){
        System.out.println("Email: "+message);
    }
    public void sendPushNotification(String message){
        System.out.println("Push: "+message);
    }
}
