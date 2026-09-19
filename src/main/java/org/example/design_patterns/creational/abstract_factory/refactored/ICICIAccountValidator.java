package org.example.design_patterns.creational.abstract_factory.refactored;

public class ICICIAccountValidator implements AccountValidator{
    @Override
    public void validateAccount(String accountNumber){
        System.out.println("Account Number Validated");
    }
}
