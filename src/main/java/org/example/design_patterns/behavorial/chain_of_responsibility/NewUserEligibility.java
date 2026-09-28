package org.example.design_patterns.behavorial.chain_of_responsibility;

public class NewUserEligibility implements EligibilityRule{
    @Override
    public boolean isEligible(User user){
        return user.isNewUser();
    }
}
