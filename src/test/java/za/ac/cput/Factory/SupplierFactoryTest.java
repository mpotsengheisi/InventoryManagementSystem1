package za.ac.cput.Factory;

/*
SupplierFactoryTest.java
Test for SupplierFactory
Author: Ahluma Nkqayi (222512571)
Date: 18 May 2025
*/

import org.junit.Test;
import za.ac.cput.Domain.Supplier;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SupplierFactoryTest {

    @Test
    public void createSupplier() {
        Supplier supplier = SupplierFactory.createSupplier("S001", "TechZone", "021 555 1234", "123 Main Road, Cape Town");
        System.out.println("Created Supplier: " + supplier);
        assertNotNull(supplier.getSupplierId());
    }
}