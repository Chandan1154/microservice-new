package com.localprogramer.inventory_service.controller;

import com.localprogramer.inventory_service.dto.InventoryRequest;
import com.localprogramer.inventory_service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/{skuCode}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@PathVariable("skuCode") String skuCode) {
        // Logic to check if the product is in stock based on the SKU code
        return inventoryService.isInStock(skuCode);
    }

    @PostMapping
    public String addInventory(@RequestBody InventoryRequest inventoryRequest) {
        return "Inventory added successfully";
    }
}
