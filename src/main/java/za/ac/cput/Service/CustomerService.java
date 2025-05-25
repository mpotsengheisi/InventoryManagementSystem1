package za.ac.cput.Service;
import za.ac.cput.Domain.Admin;
import za.ac.cput.Repository.CustomerRepository;
import za.ac.cput.Domain.Customer;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
/*
 * CustomerService.java
 * Author: Ryan Paledi (230969429)
 * Date: 25 May 2025
 */



public class CustomerService implements ICustomerService {
    private final CustomerRepository customerRepo;

    @Autowired
    public CustomerService(CustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public Customer create(Customer obj) {
        return customerRepo.save(obj);
    }

    @Override
    public Customer read(String userId) {
        return customerRepo.findById(userId).orElse(null);
    }

    @Override
    public Customer update(Customer obj) {
        return customerRepo.save(obj);
    }

    @Override
    public boolean delete(String userId) {
        if (customerRepo.existsById(userId)) {
            customerRepo.deleteById(userId);
            return true;
        }
        return false;
    }

    @Override
    public List<Customer> getAll() {
        return customerRepo.findAll();
    }

}
