package org.example.design_patterns.creational.abstract_factory.refactored;

public class Client {
    public static void main(String[] args) {
        BankType bankType = BankType.ICICI;
        if(bankType == BankType.ICICI){
            BankFactory bankFactory = new ICICIBankFactory();
            AccountValidator accountValidator = bankFactory.createAccountValidator();
            StatementParser statementParser = bankFactory.createStatementParser();
            accountValidator.validateAccount("ABFKAEH");
            statementParser.statementParser("Ashutosh loves Nivedita");
        }
    }
}
