package org.example.design_patterns.behavorial.strategy.strategy;

public class UPIFee implements FeeStrategy{
    @Override
    public Double transactionFee(Double amount){
        return 2.0;
    }
}
