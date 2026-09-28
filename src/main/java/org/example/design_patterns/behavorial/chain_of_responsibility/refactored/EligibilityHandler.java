package org.example.design_patterns.behavorial.chain_of_responsibility.refactored;

import org.example.design_patterns.behavorial.chain_of_responsibility.Coupon;
import org.example.design_patterns.behavorial.chain_of_responsibility.Order;
import org.example.design_patterns.behavorial.chain_of_responsibility.User;

public class EligibilityHandler extends CouponValidationHandler{
    public EligibilityHandler(CouponValidationHandler next){
        super(next);
    }

    @Override
    protected String check(Coupon coupon, Order order, User user) {
        if (!coupon.getEligibilityRule().isEligible(user)) {
            return "REJECTED: NOT ELIGIBLE";
        }
        return null;
    }
}
