package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

/*
 Author: Ryan Kgapjanee Paledi  (230969429)
 Date: 18 may 2025
*/

public class CustomerFactoryTest {

    @Test
    void createCustomer_validInput_success() {
        Customer customer = CustomerFactory.createCustomer(
                "C123",
                "Ryan",
                "Paledi",
                "ryan@example.com",
                "123 Main St",
                "0606708744"
        );

        assertNotNull(customer);
        assertEquals("C123", customer.getUserId());
        assertEquals("Ryan", customer.getFirstName());
        assertEquals("Paledi", customer.getLastName());
        assertEquals("ryan@example.com", customer.getEmail());
        assertEquals("123 Main St", customer.getAddress());
        assertEquals("0606708744", customer.getCellphone());
    }

    @Test
    void createCustomer_missingFields_returnsNull() {
        Customer customer = CustomerFactory.createCustomer(
                "",  // Invalid userId
                "Ryan",
                "Paledi",
                "ryan@example.com",
                "123 Main St",
                "0606708744"
        );

        assertNull(customer);
    }


}
