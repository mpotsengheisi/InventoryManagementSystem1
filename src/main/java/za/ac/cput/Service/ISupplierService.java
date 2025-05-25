package za.ac.cput.Service;

/*
ISupplierService.java
Service interface for Supplier
Author: Ahluma Nkqayi (222512571)
Date: 24 May 2025
*/

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Supplier;

import java.util.List;

@Service
public interface ISupplierService extends IService<Supplier, String> {
    List<Supplier> getAll();
}
