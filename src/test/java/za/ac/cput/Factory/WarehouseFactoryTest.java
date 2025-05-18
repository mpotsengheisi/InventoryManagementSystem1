package za.ac.cput.Factory;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Domain.Warehouse;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WarehouseFactoryTest {

    @Test
   public void createWarehouse() {
        Warehouse warehouse = WarehouseFactory.createWarehouse("Z100","Adderly Warehouse","Adderly Street");
        System.out.println("Adderly Street" +warehouse);
        assertNotNull(warehouse.getWarehouseId());
    }
}