package za.ac.cput.Repository;

/*
ISupplierRepository.java
Repository interface for Supplier
Author: Ahluma Nkqayi (222512571)
Date: 24 May 2025
*/

import za.ac.cput.Domain.Supplier;
import java.util.List;

public interface ISupplierRepository {
    Supplier create(Supplier supplier);
    Supplier read(String supplierId);
    Supplier update(Supplier supplier);
    boolean delete(String supplierId);
    List<Supplier> getAll();
}
