package org.example.design_patterns.behavorial.observer.refactored;

import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) {
        Transaction transaction = new Transaction("TXN101", new BigDecimal("5000"), "CUST-4521");

        transaction.addObserver(new SmsObserver());
        transaction.addObserver(new AuditLogObserver());
        transaction.addObserver(new FraudCheckObserver());

        transaction.setStatus(TransactionStatus.SUCCESS);   // fires all three, one call
    }
}
