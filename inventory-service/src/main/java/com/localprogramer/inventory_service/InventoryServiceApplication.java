package com.localprogramer.inventory_service;

import com.localprogramer.inventory_service.model.Inventory;
import com.localprogramer.inventory_service.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);

    }

    // This method will run after the application context is loaded and will
    // insert some sample data into the database
    // This is useful for testing purposes to ensure that there is data available when the application starts
    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
        return args -> {
            Inventory inventory1 = new Inventory();
            inventory1.setSkuCode("iphone_13");
            inventory1.setQuantity(100);

            Inventory inventory2 = new Inventory();
            inventory2.setSkuCode("iphone_13_red");
            inventory2.setQuantity(0);

            inventoryRepository.save(inventory1);
            inventoryRepository.save(inventory2);
        };
    }

}
