package org.example.design_patterns.behavorial.strategy.strategy;

public class CreditCardFee implements FeeStrategy{
    @Override
    public Double transactionFee(Double amount){
        return amount * 0.02;
    }
}
