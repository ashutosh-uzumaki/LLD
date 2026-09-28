package org.example.design_patterns.behavorial.chain_of_responsibility;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class User {
    private final String userId;
    private final String name;
    private final boolean premiumMember;
    private final LocalDate createdAt;

    public User(String userId, String name, Boolean premiumMember, LocalDate createdAt){
        this.userId = userId;
        this.name = name;
        this.premiumMember = premiumMember;
        this.createdAt = createdAt;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public boolean isPremiumMember() {
        return premiumMember;
    }

    public long getAccountAgeInDays() {
        return ChronoUnit.DAYS.between(createdAt, LocalDate.now());
    }

    public boolean isNewUser() {
        return getAccountAgeInDays() < 365;
    }
}
