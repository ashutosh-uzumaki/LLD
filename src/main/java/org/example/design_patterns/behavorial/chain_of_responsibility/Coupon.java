    package org.example.design_patterns.behavorial.chain_of_responsibility;

    import java.math.BigDecimal;
    import java.time.LocalDate;

    public class Coupon {
        private final String couponId;
        private final BigDecimal minOrderAmount;
        private final Integer usageLimit;
        private final EligibilityRule eligibilityRule;
        private final LocalDate expiry;
        private Integer currentUsageCount;

        public Coupon(String couponId, BigDecimal minOrderAmount, Integer usageLimit, EligibilityRule eligibilityRule, LocalDate expiry){
            this.couponId = couponId;
            this.minOrderAmount = minOrderAmount;
            this.usageLimit = usageLimit;
            this.eligibilityRule = eligibilityRule;
            this.expiry = expiry;
            currentUsageCount = 0;
        }

        public String getCouponId() {
            return couponId;
        }

        public BigDecimal getMinOrderAmount() {
            return minOrderAmount;
        }

        public Integer getUsageLimit() {
            return usageLimit;
        }

        public CouponType getCouponType() {
            return couponType;
        }

        public boolean isExpired(){
            return LocalDate.now().isAfter(expiry);
        }

        public boolean isUsageLimitReached(){
            return currentUsageCount >= usageLimit;
        }

        public void incrementUsageCount(){
            currentUsageCount += 1;
        }

        public EligibilityRule getEligibilityRule(){
            return eligibilityRule;
        }
    }
