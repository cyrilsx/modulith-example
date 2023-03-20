package com.example.modulith.demomodulith.inventory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;

import static org.assertj.core.api.Assertions.assertThat;

@ApplicationModuleTest
class InventoryIT {

    @Autowired
    private InventoryService inventoryService;
    @Test
    void should_return_3_items() {
        assertThat(inventoryService.all()).hasSize(3);
    }
}