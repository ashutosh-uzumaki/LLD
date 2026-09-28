package org.example.design_patterns.behavorial.chain_of_responsibility;

public class PremiumUserEligibility implements EligibilityRule{
    @Override
    public boolean isEligible(User user){
        return user.isPremiumMember();
    }
}
