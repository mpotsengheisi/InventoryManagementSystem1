package za.ac.cput.Controller;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import za.ac.cput.Domain.Order;
import za.ac.cput.Factory.OrderFactory;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/*
Author: Luhlume Iarlaith Keamogetse Radebe
Student Number: 222804424
Date: 25 May 2025
 */

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrderControllerTest {

    private static Order order;

    @Autowired
    private TestRestTemplate restTemplate;
    private static final String BASE_URL = "https://localHost:8080/inventoryManagementSystem/order";

    @BeforeAll
    public static void setUp() {
        order = OrderFactory.createOrder("O001", "C123", "Laptop", "Out for delivery", "Adderly Street", "Card");
    }


    @Test
    public void testCreateOrder() {
        String url = BASE_URL + "/create";
        ResponseEntity<Order> postResponse = restTemplate.postForEntity(url, order, Order.class);
        assertNotNull(postResponse);
        Order orderSaved = postResponse.getBody();
        //assertEquals(order.getOrderId(), createdOrder.getOrderId());
        assertEquals(order.getOrderId(), orderSaved.getOrderId());
        System.out.println("Created: " + orderSaved);
    }

    @Test
    public void testReadOrder() {
        String url = BASE_URL + "/read/" + order.getOrderId();
        ResponseEntity<Order> response = restTemplate.getForEntity(url, Order.class);
        assertNotNull(response);
        Order orderRead = response.getBody();
        assertEquals(order.getOrderId(), orderRead.getOrderId());
        System.out.println("Read: " + orderRead);
    }

    @Test
    public void testUpdateOrder() {
        LocalDate orderDate = LocalDate.of(2025, 04, 26);
        Order order = OrderFactory.createOrder("O001", "C123", "Laptop", "Out for delivery", "Adderly Street", "Card");
        String url = BASE_URL + "/update";
        ResponseEntity<Order> putResponse = restTemplate.postForEntity(url, order, Order.class);
        assertNotNull(putResponse);
        Order orderUpdated = putResponse.getBody();
        assertEquals(order.getOrderId(), orderUpdated.getOrderId());
        System.out.println("Updated: " + orderUpdated);
    }



    @Test
    public void testDeleteOrder() {
        String url = BASE_URL + "/delete/" + order.getOrderId();
        ResponseEntity<Order> response = restTemplate.getForEntity(url, Order.class);
        assertNotNull(response);
        Order orderDeleted = response.getBody();
        assertEquals(order.getOrderId(), orderDeleted.getOrderId());
        System.out.println("Deleted: " + orderDeleted);
    }


}
