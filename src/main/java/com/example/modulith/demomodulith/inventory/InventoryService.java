package com.example.modulith.demomodulith.inventory;

import com.example.modulith.demomodulith.order.Order;
import com.example.modulith.demomodulith.order.OrderService;
import org.springframework.modulith.ApplicationModuleListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    private final InventoryFakeRepo inventoryFakeRepo;
    private final OrderService orderService;

    public InventoryService(InventoryFakeRepo inventoryFakeRepo, OrderService orderService) {
        this.inventoryFakeRepo = inventoryFakeRepo;
        this.orderService = orderService;
    }

    public List<Inventory> all() {
        return List.of(
                new Inventory("Shoes", "Geneve"),
                new Inventory("Ball", "Zurich"),
                new Inventory("Cat", "Bale")
                );
    }

    @ApplicationModuleListener
    public void updateInventory(Order.OrderCompleted orderCompleted) {

    }
}
