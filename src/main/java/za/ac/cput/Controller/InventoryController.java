package za.ac.cput.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Domain.Inventory;
import za.ac.cput.Service.InventoryService;

/*
Author: Luhlume Iarlaith Keamogetse Radebe
Student Number: 222804424
Date: 25 May 2025
 */

@RestController
public class InventoryController {

    private InventoryService service;

    @Autowired
    public InventoryController(InventoryService service){
        this.service = service;
    }

    @PostMapping("/create")
    public Inventory create(@RequestBody Inventory inventory){
        this.service.create(inventory);
        return inventory;
    }

    @GetMapping("/read/{InventoryId}")
    public Inventory read(@PathVariable String inventoryId){
        this.service.read(inventoryId);
        return null;
    }

    @PutMapping("/update")
    public Inventory update(@RequestBody Inventory inventory){
        this.service.update(inventory);
        return inventory;
    }

    @DeleteMapping("/delete/{inventoryId}")
    public void delete(@PathVariable String inventoryId) {
        this.service.delete(inventoryId);
    }


}
