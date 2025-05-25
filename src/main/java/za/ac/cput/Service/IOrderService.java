package za.ac.cput.Service;

import za.ac.cput.Domain.Order;

/*
Author: Luhlume Iarlaith Keamogetse Radebe
Student Number: 222804424
Date: 25 May 2025
 */

public interface IOrderService extends IService<Order, String> {

    Order create(Order order);

    Order read(String orderId);

    Order update(Order order);

    boolean delete(String orderId);
}

