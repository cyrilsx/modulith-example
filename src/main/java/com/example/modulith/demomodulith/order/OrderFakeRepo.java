package com.example.modulith.demomodulith.order;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class OrderFakeRepo {

    private final List<Order> pendingOrders = List.of(
            new Order("1", BigDecimal.TEN),
            new Order("2", BigDecimal.ONE),
            new Order("3", BigDecimal.valueOf(13)),
            new Order("4", BigDecimal.valueOf(14)),
            new Order("5", BigDecimal.valueOf(16)),
            new Order("6", BigDecimal.valueOf(16))
    );
    List<Order> pendingOrders() {
        return pendingOrders;
    }

}
