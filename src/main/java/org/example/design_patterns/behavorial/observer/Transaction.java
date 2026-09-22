package org.example.design_patterns.behavorial.observer;

import java.math.BigDecimal;

public class Transaction {
    private final String transactionId;
    private final BigDecimal amount;
    private final String customerId;
    private TransactionStatus status;
    public Transaction(String transactionId, BigDecimal amount, String customerId){
        this.transactionId = transactionId;
        this.amount = amount;
        this.customerId = customerId;
        status = TransactionStatus.PENDING;
    }

    public void setStatus(TransactionStatus status){
        this.status = status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public String getcustomerId(){
        return customerId;
    }
}
