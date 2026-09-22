package org.example.design_patterns.behavorial.observer.refactored;

public class AuditLogObserver implements Observer {
    @Override
    public void onStatusChange(Transaction transaction) {
        System.out.println("AUDIT: txn=" + transaction.getTransactionId()
                + ", amount=" + transaction.getAmount()
                + ", status=" + transaction.getStatus());
    }
}
