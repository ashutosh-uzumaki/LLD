package org.example.design_patterns.behavorial.chain_of_responsibility.refactored;

import org.example.design_patterns.behavorial.chain_of_responsibility.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        // Build handlers back-to-front: last one first, since each needs 'next' at construction
        CouponValidationHandler eligibilityHandler = new EligibilityHandler(null);
        CouponValidationHandler minOrderAmountHandler = new MinOrderAmountHandler(eligibilityHandler);
        CouponValidationHandler usageLimitHandler = new UsageLimitHandler(minOrderAmountHandler);
        CouponValidationHandler expiryHandler = new ExpiryHandler(usageLimitHandler);
        // expiryHandler is now the HEAD of the chain — this is what you call .validate(...) on

        Coupon coupon = new Coupon(
                "SAVE50", new BigDecimal("500"), 100,
                new EligibilityRule() {
                    public boolean isEligible(User user) { return true; }  // quick inline rule for testing
                },
                LocalDate.now().plusDays(10)
        );

        Order order = new Order("ORD1", java.util.List.of("item1"), new BigDecimal("1000"));
        User user = new User("U1", "Ashutosh", false, LocalDate.now().minusYears(1));

        String result = expiryHandler.validate(coupon, order, user);
        System.out.println(result);
    }
}