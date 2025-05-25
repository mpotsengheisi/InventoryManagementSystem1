package za.ac.cput.Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import za.ac.cput.Domain.Inventory;


/*
Author: Luhlume Iarlaith Keamogetse Radebe
Student Number: 222804424
Date: 25 May 2025
 */


@DataJpaTest
public class InventoryRepositoryTest {

    @Autowired
    private static InventoryRepository repository;

    private Inventory inventory;

    @Test
    public void testCreateInventory(){
       Inventory inventory = new Inventory.Builder()
               .setInventoryId("I001")
               .setProductId("A123")
               .setProductName("Samsung Smart TV 55 inch")
               .setPrice(18799)
               .setCategory("Electronics")
               .setSupplier("Samsung Electronics Co.")
               .setQuantity(2)
               .setReorderLevel(15)
               .setReason("Purchase")
               .build();
    }

    @Test
    public void testSave() {
        repository.save(inventory);
    }

}

