package com.example.modulith.demomodulith.inventory;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
class InventoryFakeRepo {

    List<Inventory> all() {
        return List.of(
                new Inventory("Shoes", "Geneve"),
                new Inventory("Ball", "Zurich"),
                new Inventory("Cat", "Bale")
        );
    }
}
