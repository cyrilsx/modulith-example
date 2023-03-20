package com.example.modulith.demomodulith.inventory;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    private final InventoryFakeRepo inventoryFakeRepo;

    public InventoryService(InventoryFakeRepo inventoryFakeRepo) {
        this.inventoryFakeRepo = inventoryFakeRepo;
    }

    public List<Inventory> all() {
        return List.of(
                new Inventory("Shoes", "Geneve"),
                new Inventory("Ball", "Zurich"),
                new Inventory("Cat", "Bale")
                );
    }
}
