package org.example.design_patterns.behavorial.observer.refactored;

import org.example.design_patterns.behavorial.observer.refactored.Transaction;


public interface Observer {
    void onStatusChange(Transaction transaction);
}
