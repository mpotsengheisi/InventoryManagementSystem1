package za.ac.cput.Service;
import java.util.List;

import za.ac.cput.Domain.Admin;
import za.ac.cput.Domain.Customer;
/*
 * ICustomerService.java
 * Author: Ryan Paledi (230969429)
 * Date: 25 May 2025
 */

public interface ICustomerService extends IService <Customer, String> {
    List<Customer> getAll();
}
