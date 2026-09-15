package org.example.design_patterns.behavorial.strategy.strategy;

public class FeeFactory {
    public static FeeStrategy getFeeStrategy(PaymentType paymentType){
        if(paymentType.equals(PaymentType.UPI)){
            return new UPIFee();
        }else if(paymentType.equals(PaymentType.CREDIT_CARD)){
            return new CreditCardFee();
        }else{
            throw new RuntimeException("Invalid Payment type!!");
        }
    }
}
