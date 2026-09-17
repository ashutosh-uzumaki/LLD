package org.example.design_patterns.creational.factory.factory;

public class SmsNotificationDispatcher extends NotificationDispatcher{
    public void dispatch(String recepient, String message){
        super.dispatch(recepient, message);
    }

    @Override
    public Notifier createNotifier(){
        return new SmsNotifier();
    }
}
