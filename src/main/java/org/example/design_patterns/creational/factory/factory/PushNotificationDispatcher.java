package org.example.design_patterns.creational.factory.factory;

public class PushNotificationDispatcher extends NotificationDispatcher{
    public void dispatch(String recepient, String message){
        super.dispatch(recepient, message);
    }

    @Override
    public Notifier createNotifier(){
        return new PushNotifier();
    }
}
