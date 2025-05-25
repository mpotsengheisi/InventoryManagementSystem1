package za.ac.cput.Service;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Inventory;
import za.ac.cput.Repository.IInventoryRepository;

/*
Author: Luhlume Iarlaith Keamogetse Radebe
Student Number: 222804424
Date: 25 May 2025
 */

@Service
public class InventoryService implements IInventoryService <Inventory, String> {


    private static InventoryService service;


    private IInventoryRepository repository;

    // Static method to get the singleton instance
    public static InventoryService getService() {
        if (service == null) {
            service = new InventoryService();
        }
        return service;
    }



    @Override
    public Inventory create(Inventory inventory) {
        return this.repository.create(inventory);
    }

    @Override
    public Inventory read(String inventoryId) {
        return this.repository.read(Long.valueOf(inventoryId));
    }

    @Override
    public Inventory update(Inventory inventory) {
        return this.repository.update(inventory);
    }

    @Override
    public boolean delete(String inventoryId) {
        return false;
    }

}
