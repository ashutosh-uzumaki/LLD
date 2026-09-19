package org.example.design_patterns.creational.abstract_factory;

public class Client {
    public static void main(String[] args) {
        BankType bankType = BankType.ICICI;
        if(bankType == BankType.HDFC){
            HdfcAccountValidator hdfcAccountValidator = new HdfcAccountValidator();
            HdfcStatementParser hdfcStatementParser = new HdfcStatementParser();

            hdfcAccountValidator.validateAccount("125y3849");
            hdfcStatementParser.statementParser("statement");
        }else{
            ICICIAccountValidator iciciAccountValidator = new ICICIAccountValidator();
            ICICIStatementParser iciciStatementParser = new ICICIStatementParser();
            iciciAccountValidator.validateAccount("234652rbw");
            iciciStatementParser.statementParser("icici statement");
        }
    }
}
