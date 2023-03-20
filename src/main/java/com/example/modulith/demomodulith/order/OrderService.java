package com.example.modulith.demomodulith.order;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderFakeRepo orderFakeRepo;

    public OrderService(OrderFakeRepo orderFakeRepo) {
        this.orderFakeRepo = orderFakeRepo;
    }

    boolean passOrder(Order order) {
        return true;
    }
}
