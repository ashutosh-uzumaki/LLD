package org.example.design_patterns.behavorial.strategy.bad;

public class PaymentCalculation {
    public double transactionFee(Double amount, PaymentType paymentType){
        if(paymentType.equals(PaymentType.UPI)){
            amount = 2.0;
        }else if(paymentType.equals(PaymentType.CREDIT_CARD)){
            amount *= 0.02;
        }else{
            amount *= 0.01;
        }

        return amount;
    }
}
