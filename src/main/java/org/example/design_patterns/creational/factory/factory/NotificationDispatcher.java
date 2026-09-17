package org.example.design_patterns.creational.factory.factory;

public abstract class NotificationDispatcher {
    public void dispatch(String recepient, String message){
        Notifier notifier = createNotifier();
        System.out.println("[LOG] dispatching via "+notifier.getClass().getName());
        notifier.send(recepient, message);
    }

    public abstract Notifier createNotifier();
}
