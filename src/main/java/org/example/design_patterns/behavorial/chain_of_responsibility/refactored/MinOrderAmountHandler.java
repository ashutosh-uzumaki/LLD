package org.example.design_patterns.behavorial.chain_of_responsibility.refactored;

import org.example.design_patterns.behavorial.chain_of_responsibility.Coupon;
import org.example.design_patterns.behavorial.chain_of_responsibility.Order;
import org.example.design_patterns.behavorial.chain_of_responsibility.User;

public class MinOrderAmountHandler extends CouponValidationHandler{
    public MinOrderAmountHandler(CouponValidationHandler next){
        super(next);
    }

    @Override
    public String check(Coupon coupon, Order order, User user){
        if(order.getAmount().compareTo(coupon.getMinOrderAmount()) < 0){
            return "REJECTED: MINIMUM ORDER AMOUNT NOT MET";
        }
        return null;
    }
}
