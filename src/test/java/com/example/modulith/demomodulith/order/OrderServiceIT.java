package com.example.modulith.demomodulith.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;
import org.springframework.modulith.test.Scenario;

import java.math.BigDecimal;
import java.util.UUID;

@ApplicationModuleTest
class OrderServiceIT {

    //    @MockBean
//    private InventoryService inventoryService
    @Autowired
    private OrderService orderService;

    @Test
    void is_always_true() {
        Assertions.assertThat(orderService.passOrder(new Order(new Order.OrderIdentifier(UUID.randomUUID()), BigDecimal.TEN))).isTrue();
    }

    @Test
    void completed_order_ok(Scenario scenario) {
        Order.OrderIdentifier id = new Order.OrderIdentifier(UUID.randomUUID());
        scenario.stimulate(() -> orderService.completeOrder(new Order(id, BigDecimal.ZERO)))
                .andWaitForEventOfType(Order.OrderCompleted.class)
                .matching(order -> order.id().equals(id))
                .toArrive();
    }
}