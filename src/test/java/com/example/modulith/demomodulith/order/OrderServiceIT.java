package com.example.modulith.demomodulith.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;

import java.math.BigDecimal;

@ApplicationModuleTest
class OrderServiceIT {

    //    @MockBean
//    private InventoryService inventoryService
    @Autowired
    private OrderService orderService;

    @Test
    void is_always_true() {
        Assertions.assertThat(orderService.passOrder(new Order("id", BigDecimal.TEN))).isTrue();
    }
}