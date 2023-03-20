package com.example.modulith.demomodulith.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@ApplicationModuleTest
class OrderServiceIT {

    @Autowired
    private OrderService orderService;
    @Test
    void is_always_true() {
        Assertions.assertThat(orderService.passOrder(new Order("id", BigDecimal.TEN))).isTrue();
    }
}