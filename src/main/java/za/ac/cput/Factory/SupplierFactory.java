package za.ac.cput.Factory;
/*Supplier.java
Supplier Factory class
Author: Ahluma Nkqayi (222512571)
Date: 18 May 2025
 */
import za.ac.cput.Domain.Supplier;
import za.ac.cput.Util.Helper;

public class SupplierFactory {
    public static Supplier createSupplier(String supplierId, String supplierName, String contactDetails, String address) {
        if (Helper.isNullOrEmpty(supplierId) || Helper.isNullOrEmpty(supplierName) || Helper.isNullOrEmpty(contactDetails)|| Helper.isNullOrEmpty(address)) {
            return null;
        }

        return new Supplier.Builder()
                .setSupplierId(supplierId)
                .setSupplierName(supplierName)
                .setContactDetails(contactDetails)
                .setAddress(address)
                .build();
    }
}