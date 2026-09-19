package org.example.design_patterns.creational.abstract_factory.refactored;

public class ICICIStatementParser implements StatementParser{
    @Override
    public void statementParser(String statement){
        System.out.println("Statement Parser");
    }
}
