package org.example.design_patterns.behavorial.strategy.strategy;

public class PaymentCalculation {
    private final FeeStrategy feeStrategy;
    public PaymentCalculation(FeeStrategy feeStrategy){
        this.feeStrategy = feeStrategy;
    }

    public Double getTransactionFee(Double amount){
        return feeStrategy.transactionFee(amount);
    }
}
