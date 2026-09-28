package org.example.design_patterns.behavorial.chain_of_responsibility.refactored;

import org.example.design_patterns.behavorial.chain_of_responsibility.Coupon;
import org.example.design_patterns.behavorial.chain_of_responsibility.Order;
import org.example.design_patterns.behavorial.chain_of_responsibility.User;

public class UsageLimitHandler extends CouponValidationHandler{
    public UsageLimitHandler(CouponValidationHandler next){
        super(next);
    }
    @Override
    public String check(Coupon coupon, Order order, User user){
        if(coupon.isUsageLimitReached()){
            return "REJECTED: COUPON HAS REACHED USAGE LIMIT";
        }
        return null;
    }
}
