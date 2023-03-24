package com.example.modulith.demomodulith.order;

import com.example.modulith.demomodulith.inventory.InventoryService;
import com.example.modulith.demomodulith.inventory.subinven.InventoryHelper;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderFakeRepo orderFakeRepo;
//    private InventoryService inventoryService;

    public OrderService(OrderFakeRepo orderFakeRepo) {
        this.orderFakeRepo = orderFakeRepo;
    }

    boolean passOrder(Order order) {
        return true;
    }

    void completeOrder(Order order) {
        this.orderFakeRepo.save(order.complete());
    }
}
