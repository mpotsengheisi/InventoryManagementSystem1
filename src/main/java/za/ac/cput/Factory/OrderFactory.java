package za.ac.cput.Factory;

/*
Author: Luhlume Iarlaith Keamogetse Radebe (222804424)
Date:
 */


import za.ac.cput.Domain.Order;

public class OrderFactory {
    public static Order createOrder(String orderId, String customerId, String orderItems, String status, String deliveryAddress, String paymentMethod) {
        if (orderId == null || orderId.isEmpty() || customerId == null || customerId.isEmpty() || orderItems == null || orderItems.isEmpty() || status == null || status.isEmpty() || deliveryAddress == null || deliveryAddress.isEmpty() || paymentMethod == null || paymentMethod.isEmpty()) {
            return null;
        }

        return new Order.Builder()
                .setOrderId(orderId)
                .setCustomerId(customerId)
                .setOrderItems(orderItems)
                .setStatus(status)
                .setDeliveryAddress(deliveryAddress)
                .setPaymentMethod(paymentMethod)
                .build();

    }

}
