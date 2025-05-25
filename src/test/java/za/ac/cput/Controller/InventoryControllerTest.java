package za.ac.cput.Controller;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import za.ac.cput.Domain.Inventory;
import za.ac.cput.Domain.Order;
import za.ac.cput.Factory.InventoryFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


/*
Author: Luhlume Iarlaith Keamogetse Radebe
Student Number: 222804424
Date: 25 May 2025
 */

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.class)
public class InventoryControllerTest {

    private static Inventory inventory;

    @Autowired
    private TestRestTemplate restTemplate;
    private static final String BASE_URL = "https://localHost:8080/inventoryManagementSystem/inventory";

    @BeforeAll
    public static void setUp() {
        inventory = InventoryFactory.createInventory("I001", "A123", "Laptop", 18799, "Electronics", "TechZone", 2, 90, "Order Placed");
    }

    @Test
    public void create(){
        String url = BASE_URL + "/create";
        ResponseEntity<Inventory> postResponse = restTemplate.postForEntity(url, inventory, Inventory.class);
        assertNotNull(postResponse);
        Inventory inventorySaved = postResponse.getBody();
        //assertEquals(order.getOrderId(), createdOrder.getOrderId());
        assertEquals(inventory.getInventoryId(), inventorySaved.getInventoryId());
        System.out.println("Created: " + inventorySaved);
    }

    @Test
    public void read(){
        String url = BASE_URL + "/read";
        ResponseEntity<Inventory> getResponse = restTemplate.getForEntity(url, Inventory.class);
        assertNotNull(getResponse);
        Inventory inventoryRead = getResponse.getBody();
        assertEquals(inventory.getInventoryId(), inventoryRead.getInventoryId());
        System.out.println("Read: " + inventoryRead);

    }

    @Test
    public void update(){
        String url = BASE_URL + "/update";
        ResponseEntity<Inventory> putResponse = restTemplate.postForEntity(url, inventory, Inventory.class);
        assertNotNull(putResponse);
        Inventory inventoryUpdated = putResponse.getBody();
        assertEquals(inventory.getInventoryId(), inventoryUpdated.getInventoryId());
        System.out.println("Updated: " + inventoryUpdated);

    }

    @Test
    public void delete(){
        String url = BASE_URL + "/delete";
        ResponseEntity<Inventory> deleteResponse = restTemplate.postForEntity(url, inventory, Inventory.class);
        assertNotNull(deleteResponse);
        Inventory inventoryDeleted = deleteResponse.getBody();
        assertEquals(inventory.getInventoryId(), inventoryDeleted.getInventoryId());
        System.out.println("Deleted: " + inventoryDeleted);

    }


}
