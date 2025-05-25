package za.ac.cput.Service;

import za.ac.cput.Domain.Inventory;

/*
Author: Luhlume Iarlaith Keamogetse Radebe
Student Number: 222804424
Date: 25 May 2025
 */

public interface IInventoryService<I, S> extends IService<Inventory, String>{

    Inventory create(Inventory inventory);

    Inventory read(String inventoryId);

    Inventory update(Inventory inventory);

    boolean delete(String inventoryId);

}
