package org.example.design_patterns.behavorial.chain_of_responsibility;

public class CouponValidation {
   public String validateCoupon(Coupon coupon, Order order, User user){
        if(coupon.isExpired()){
            return "REJECTED: EXPIRED COUPON";
        }
        if(coupon.isUsageLimitReached()){
            return "REJECTED: USAGE LIMIT REACHED";
        }
        if(order.getAmount().compareTo(coupon.getMinOrderAmount()) < 0){
            return "REJECTED: MIN ORDER AMOUNT NOT MET";
        }
        if(!coupon.getEligibilityRule().isEligible(user)){
            return "REJECTED: ELIGIBILITY RULE NOT MET";
        }
        return "ACCEPTED: COUPON APPLIED";
   }
}
