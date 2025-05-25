package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Domain.Order;
import za.ac.cput.Service.OrderService;

/*
Author: Luhlume Iarlaith Keamogetse Radebe
Student Number: 222804424
Date: 25 May 2025
 */

@RestController
public class OrderController {

    private OrderService service;

    @Autowired
    public OrderController(OrderService service){
        this.service = service;
    }

    @PostMapping("/create")
    public Order create(@RequestBody Order order){
        this.service.create(order);
        return order;
    }

    @GetMapping("/read/{OrderId}")
    public Order read(@PathVariable String orderId){
        this.service.read(orderId);
        return null;
    }

    @PutMapping("/update")
    public Order update(@RequestBody Order order){
        this.service.update(order);
        return order;
    }

    @DeleteMapping("/delete/{OrderId}")
    public void delete(@PathVariable String orderId) {
        this.service.delete(orderId);
    }


}
