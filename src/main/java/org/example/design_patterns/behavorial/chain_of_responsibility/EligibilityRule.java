package org.example.design_patterns.behavorial.chain_of_responsibility;

public interface EligibilityRule {
    boolean isEligible(User user);
}
