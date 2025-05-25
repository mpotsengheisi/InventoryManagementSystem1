package za.ac.cput.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Domain.Customer;
import za.ac.cput.Service.CustomerService;


import java.util.List;
/*
 * CustomerController.java
 * Author: Ryan Paledi (230969429)
 * Date: 25 May 2025
 */
@RestController
@RequestMapping("/customer")

public class CustomerController {
    @Autowired
    private CustomerService adminService;

    @PostMapping("/create")
    public Customer create(@RequestBody Customer customer) {
        return CustomerService.create(customer);
    }

    @GetMapping("/read/{adminId}")
    public Customer read(@PathVariable String adminId) {
        return adminService.read(userId);
    }

    @PostMapping("/update")
    public Customer update(@RequestBody Customer customer) {
        return CustomerService.update(customer);
    }

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId) {
        CustomerService.delete(userId);
    }

    @GetMapping("/getAll")
    public List<Customer> getAll() {
        return CustomerService.getAll();
    }



}
