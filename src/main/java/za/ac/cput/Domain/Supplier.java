package za.ac.cput.Domain;

/* Supplier.java
   Supplier domain class
   Author: Ahluma Nkqayi (222512571)
   Date: 11 May 2025
*/

public class Supplier {
    private final String supplierId;
    private final String supplierName;
    private final String contactDetails;
    private final String address;

    private Supplier(Builder builder) {
        this.supplierId = builder.supplierId;
        this.supplierName = builder.supplierName;
        this.contactDetails = builder.contactDetails;
        this.address = builder.address;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId='" + supplierId + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {
        private String supplierId;
        private String supplierName;
        private String contactDetails;
        private String address;

        public Builder setSupplierId(String supplierId) {
            this.supplierId = supplierId;
            return this;
        }

        public Builder setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }

        public Builder setContactDetails(String contactDetails) {
            this.contactDetails = contactDetails;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder copy(Supplier supplier) {
            this.supplierId = supplier.supplierId;
            this.supplierName = supplier.supplierName;
            this.contactDetails = supplier.contactDetails;
            this.address = supplier.address;
            return this;
        }

        public Supplier build() {
            return new Supplier(this);
        }
    }
}