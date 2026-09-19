package org.example.design_patterns.creational.abstract_factory.refactored;

public interface BankFactory {
    AccountValidator createAccountValidator();
    StatementParser createStatementParser();
}
