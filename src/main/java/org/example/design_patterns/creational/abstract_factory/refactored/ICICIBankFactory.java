package org.example.design_patterns.creational.abstract_factory.refactored;

public class ICICIBankFactory implements BankFactory{
    @Override
    public AccountValidator createAccountValidator(){
        return new ICICIAccountValidator();
    }

    @Override
    public StatementParser createStatementParser(){
        return new ICICIStatementParser();
    }
}
