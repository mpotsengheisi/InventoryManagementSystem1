package za.ac.cput.Factory;

import za.ac.cput.Domain.Order;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.Test;

/*
Author: Luhlume Iarlaith Keamogetse Radebe
Date: 18 May 2025
OrderFactoryTest.java
 */

public class OrderFactoryTest {
    @Test
    public void createOrder() {
        Order order = OrderFactory.createOrder("O001", "C123", "Laptop", "Out for delivery", "Adderly Street", "Card");
        System.out.println("Created Order: " + order);
        assertNotNull(order.getOrderId());
    }

    private void assertNotNull(String orderId) {
        assertNotNull(orderId);
    }

}
