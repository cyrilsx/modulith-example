package com.example.modulith.demomodulith.order;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class OrderFakeRepo {

    private final List<Order> pendingOrders = List.of(
            new Order(new Order.OrderIdentifier(UUID.randomUUID()), BigDecimal.TEN),
            new Order(new Order.OrderIdentifier(UUID.randomUUID()), BigDecimal.ONE),
            new Order(new Order.OrderIdentifier(UUID.randomUUID()), BigDecimal.valueOf(13)),
            new Order(new Order.OrderIdentifier(UUID.randomUUID()), BigDecimal.valueOf(14)),
            new Order(new Order.OrderIdentifier(UUID.randomUUID()), BigDecimal.valueOf(16)),
            new Order(new Order.OrderIdentifier(UUID.randomUUID()), BigDecimal.valueOf(16))
    );

    private final List<Order> completedOrders = new ArrayList<>();
    List<Order> pendingOrders() {
        return pendingOrders;
    }

    void save(Order order) {
        this.completedOrders.add(order);
    }

}
