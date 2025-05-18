package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Admin;

import static org.junit.jupiter.api.Assertions.*;

/*
 Author: Ryan Paledi Kgapjanee (230969429)
 Date:
*/

public class AdminFactoryTest {

    @Test
    void createAdmin_validInput_success() {
        Admin admin = AdminFactory.createAdmin(
                "A001",
                "adminUser",
                "securePassword123",
                "System Admin"
        );

        assertNotNull(admin);
        assertEquals("A001", admin.getAdminId());
        assertEquals("adminUser", admin.getUserName());
        assertEquals("securePassword123", admin.getPassword());
        assertEquals("System Admin", admin.getRole());
    }

    @Test
    void createAdmin_missingUsername_returnsNull() {
        Admin admin = AdminFactory.createAdmin(
                "A002",
                "",  // Missing username
                "securePassword123",
                "System Admin"
        );

        assertNull(admin);
    }


}
