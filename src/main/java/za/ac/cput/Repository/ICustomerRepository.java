package za.ac.cput.Repository;
import za.ac.cput.Domain.Admin;
import za.ac.cput.Domain.Customer;
import java.util.List;
/*
 * ICustomerRepository.java
 * Author: Ryan Paledi (230969429)
 * Date: 25 May 2025
 */

public interface ICustomerRepository {
    Customer create(Customer customer);
    Customer read(String userId);
    Customer update(Customer customer);
    boolean delete(String userId);
    List<Admin> getAll();
}
