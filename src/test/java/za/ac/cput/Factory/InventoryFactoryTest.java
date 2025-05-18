package za.ac.cput.Factory;

import org.junit.Test;
import za.ac.cput.Domain.Inventory;

import static org.junit.Assert.assertNotNull;

/*
Author: Luhlume Iarlaith Keamogetse Radebe
Date: 18 May 2025
InventoryFactoryTest.java
 */

public class InventoryFactoryTest {
    @Test
    public void createInventory() {
        Inventory inventory = InventoryFactory.createInventory("I001", "A123", "Television", 50, "Electronics", "TechZone", 14, 20, "Stock");
        System.out.println("Created Inventory: " + inventory);
        assertNotNull(inventory.getInventoryId());
    }

}
