package org.example.design_patterns.behavorial.observer.refactored;

public class FraudCheckObserver implements Observer {
    @Override
    public void onStatusChange(Transaction transaction) {
        System.out.println("Fraud re-scan triggered for txn=" + transaction.getTransactionId()
                + ", amount=" + transaction.getAmount());
    }
}
