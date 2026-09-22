package org.example.design_patterns.behavorial.observer;

public class TransactionService {
    private final NotificationService notificationService;
    public TransactionService(NotificationService notificationService){
        this.notificationService = notificationService;
    }
    public void process(Transaction transaction, String customer){
        System.out.println("Processing transaction");
        transaction.setStatus(TransactionStatus.SUCCESS);
        notificationService.send(customer, "Transaction successful");
    }
}
