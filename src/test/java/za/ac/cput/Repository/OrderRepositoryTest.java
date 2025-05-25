package za.ac.cput.Repository;

import org.junit.Test;
import za.ac.cput.Domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.Date;
import java.util.List;


import static org.junit.Assert.*;

/*
Author: Luhlume Iarlaith Keamogetse Radebe
Student Number: 222804424
Date: 25 May 2025
 */


@DataJpaTest
public class OrderRepositoryTest {

    @Autowired
    private static  OrderRepository repository;


    @Test
    public void testSaveOrder() {
        Order order = new Order.Builder()
                .setOrderId("ORD123")
                .setCustomerId("CUST001")
                .setOrderDate(new Date())
                .setAmountPaid(2500.00)
                .setStatus("Processing")
                .setDeliveryAddress("123 Main St")
                .setPaymentMethod("Credit Card")
                .build();

        Order savedOrder = repository.save(order);
        assertNotNull(savedOrder);
        assertEquals("ORD123", savedOrder.getOrderId());
    }

    @Test
    public void testFindByCustomerId() {
        Order order = new Order.Builder()
                .setOrderId("ORD456")
                .setCustomerId("C123")
                .setOrderDate(new Date())
                .setAmountPaid(3000.00)
                .setStatus("Shipped")
                .setDeliveryAddress("456 Elm St")
                .setPaymentMethod("PayPal")
                .build();

        repository.save(order);

        List<Order> orders = repository.findByCustomerId("C123");
        assertFalse(orders.isEmpty());
        assertEquals("ORD456", orders.get(0).getOrderId());
    }
}
