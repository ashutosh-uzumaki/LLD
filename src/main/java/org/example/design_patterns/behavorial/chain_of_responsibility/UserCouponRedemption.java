package org.example.design_patterns.behavorial.chain_of_responsibility;

public class UserCouponRedemption {
    private final String userId;
    private final String couponId;
    private Integer redemptionCount;

    public UserCouponRedemption(String userId, String couponId) {
        this.userId = userId;
        this.couponId = couponId;
        this.redemptionCount = 0;
    }

    public String getUserId() {
        return userId;
    }

    public String getCouponId() {
        return couponId;
    }

    public Integer getRedemptionCount() {
        return redemptionCount;
    }

    public void incrementRedemptionCount() {
        redemptionCount += 1;
    }
}
