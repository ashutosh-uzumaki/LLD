package org.example.design_patterns.behavorial.observer.refactored;


public class SmsObserver implements Observer {
    @Override
    public void onStatusChange(Transaction transaction) {
        System.out.println("SMS to " + transaction.getCustomerId() + ": Transaction "
                + transaction.getTransactionId() + " is now " + transaction.getStatus());
    }
}