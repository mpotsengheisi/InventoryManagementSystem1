package za.ac.cput.Domain;

public class Customer {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String cellphone;

    private Customer() {}

    private Customer(Builder builder) {
        this.userId = builder.userId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.cellphone = builder.cellphone;

    }


    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCellphone() {
        return cellphone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", cellphone='" + cellphone + '\'' +
                '}';
    }

    public static class Builder {
        private String userId;
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String cellphone;

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCellphone(String cellphone) {
            this.cellphone = cellphone;
            return this;
        }

        public Customer.Builder copy(Customer customer) {
            this.userId = customer.userId;
            this.firstName = customer.firstName;
            this.lastName = customer.lastName;
            this.email = customer.email;
            this.address = customer.address;
            this.cellphone = customer.cellphone;
            return this;
        }



    }




}
