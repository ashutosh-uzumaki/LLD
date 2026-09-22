package org.example.design_patterns.behavorial.observer.refactored;

import org.example.design_patterns.behavorial.observer.refactored.TransactionStatus;

import java.math.BigDecimal;
import java.util.*;

public class Transaction {
    private final String transactionId;
    private final BigDecimal amount;
    private final String customerId;
    private TransactionStatus status;
    private final List<Observer> observers = new ArrayList<>();
    public Transaction(String transactionId, BigDecimal amount, String customerId){
        this.transactionId = transactionId;
        this.amount = amount;
        this.customerId = customerId;
        status = TransactionStatus.PENDING;
    }

    public void setStatus(TransactionStatus status){
        this.status = status;
        for(Observer observer: observers){
            observer.onStatusChange(this);
        }
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

    public String getCustomerId(){
        return customerId;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }
}
