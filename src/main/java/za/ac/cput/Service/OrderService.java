package za.ac.cput.Service;
import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Order;
import za.ac.cput.Repository.IOrderRepository;

/*
Author: Luhlume Iarlaith Keamogetse Radebe
Student Number: 222804424
Date: 25 May 2025
 */

@Service
public class OrderService implements IOrderService {

    private static OrderService service;


    private IOrderRepository repository;

    // Static method to get the singleton instance
    public static OrderService getService() {
        if (service == null) {
            service = new OrderService();
        }
        return service;
    }

    @Override
    public Order create(Order order) {
        return this.repository.create(order);
    }

    @Override
    public Order read(String orderId) {
        return this.repository.read(orderId);
    }

    @Override
    public Order update(Order order) {
        return this.repository.update(order);
    }

    @Override
    public boolean delete(String orderId) {
        return this.repository.delete(orderId);
    }
}
