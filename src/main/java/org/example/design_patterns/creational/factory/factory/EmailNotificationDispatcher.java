package org.example.design_patterns.creational.factory.factory;

public class EmailNotificationDispatcher extends NotificationDispatcher{
    public void dispatch(String recepient, String message){
        String emailMessage = "<html><body>"+message+"</body></html>";
        super.dispatch(recepient, emailMessage);
    }

    public Notifier createNotifier(){
        return new EmailNotifier();
    }
}
