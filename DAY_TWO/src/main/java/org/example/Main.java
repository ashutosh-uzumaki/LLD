package org.example;

import org.example.ocp.good_code.*;

import java.util.*;

//OCP - OPEN FOR EXTENSION BUT CLOSED FOR MODIFICATION
public class Main {
    public static void main(String[] args) {

        List<Notification> notifications = new ArrayList<>();
        notifications.add(new EmailNotification());
        notifications.add(new SmsNotification());
        notifications.add(new PushNotification());
        NotificationSender sender = new NotificationSender();
        sender.sendNotifications(notifications, "Hi, Ashutosh!!!");
    }
}