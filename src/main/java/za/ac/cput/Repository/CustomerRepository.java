package za.ac.cput.Repository;
import za.ac.cput.Domain.Admin;
import za.ac.cput.Domain.Customer;
import java.util.ArrayList;
import java.util.List;
/*
 * CustomerRepository.java
 * Author: Ryan Paledi (230969429)
 * Date: 25 May 2025
 */

public class CustomerRepository implements ICustomerRepository {
    private static CustomerRepository repository = null;
    private List<Customer> customerList;


    private CustomerRepository() {
        customerList = new ArrayList<>();
    }


    public static CustomerRepository getInstance() {
        if (repository == null) {
            repository = new CustomerRepository();
        }
        return repository;
    }

    @Override
    public Customer create(Customer customer) {
        if (customer== null || customer.getUserId() == null) {
            return null;
        }

        if (exists(customer.getUserId())) {
            return null;
        }

        customerList.add(customer);
        return customer;
    }

    @Override
    public Customer read(String userId) {
        for (Customer customer : customerList) {
            if (customer.getUserId().equals(userId)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        if (customer == null) {
            return null;
        }

        int index = findIndexByUserId(customer.getUserId());

        if (index == -1) {
            return null;
        }

        customerList.set(index, customer);
        return customer;
    }

    @Override
    public boolean delete(String userId) {
        int index = findIndexByUserId(userId);

        if (index == -1) {
            return false;
        }

        customerList.remove(index);
        return true;
    }

    @Override
    public List<Customer> getAll() {
        return new ArrayList<>(customerList);
    }


    private int findIndexByUserId(String adminId) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getUserId().equals(userId)) {
                return i;
            }
        }
        return -1;
    }


    private boolean exists(String userId) {
        return findIndexByUserId(userId) != -1;
    }

}
