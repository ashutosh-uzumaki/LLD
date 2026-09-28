package org.example.design_patterns.behavorial.chain_of_responsibility.refactored;

import org.example.design_patterns.behavorial.chain_of_responsibility.Coupon;
import org.example.design_patterns.behavorial.chain_of_responsibility.Order;
import org.example.design_patterns.behavorial.chain_of_responsibility.User;

public class ExpiryHandler extends CouponValidationHandler {
    public ExpiryHandler(CouponValidationHandler next) {
        super(next);
    }

    @Override
    public String check(Coupon coupon, Order order, User user) {
        if (coupon.isExpired()) {
            return "REJECTED: COUPON HAS EXPIRED";
        }
        return null;
    }
}
