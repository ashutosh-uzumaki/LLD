package org.example.ocp.good_code;
import java.util.*;
public class NotificationSender {
    public void sendNotifications(List<Notification> notifications, String message){
        for(Notification notification: notifications){
            notification.sendMessage(message);
        }
    }
}
//NOW THE NOTIFICATIONSENDER CLASS IS NOT TIGHTLY COUPLED WITH THE NOTIFICATION TYPES.
//DEPEND ON ABSTRACTIONS RATHER THAN CONCRETE CLASSES.

