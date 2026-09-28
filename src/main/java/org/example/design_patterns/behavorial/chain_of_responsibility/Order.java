package org.example.design_patterns.behavorial.chain_of_responsibility;

import java.math.BigDecimal;
import java.util.*;

public class Order {
    private final String orderId;
    private final List<String> products;
    private final BigDecimal amount;

    public Order(String orderId, List<String> products, BigDecimal amount){
        this.orderId = orderId;
        this.products = products;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public List<String> getProducts() {
        return products;
    }

    public BigDecimal getAmount(){
        return amount;
    }
}
