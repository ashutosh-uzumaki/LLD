package org.example.design_patterns.behavorial.chain_of_responsibility.refactored;

import org.example.design_patterns.behavorial.chain_of_responsibility.Coupon;
import org.example.design_patterns.behavorial.chain_of_responsibility.Order;
import org.example.design_patterns.behavorial.chain_of_responsibility.User;

public abstract class CouponValidationHandler {
    protected CouponValidationHandler next;
    public CouponValidationHandler(CouponValidationHandler next){
        this.next = next;
    }

    public String validate(Coupon coupon, Order order, User user){
        String result = check(coupon, order, user);
        if(result != null){
            return result;
        }
        if(next != null) {
            return next.validate(coupon, order, user);
        }
        return "ACCEPTED";
    }

    protected abstract String check(Coupon coupon, Order order, User user);
}
