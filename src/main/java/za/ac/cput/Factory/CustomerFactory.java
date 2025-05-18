package za.ac.cput.Factory;
/*
Author: Ryan Kgapjanee Paledi  (230969429)
Date:
 */
import za.ac.cput.Domain.Admin;
import za.ac.cput.Domain.Customer;
public class CustomerFactory {
    public static Customer createCustomer(String UserId, String FirstName, String LastName, String email, String address, String cellphone) {
        if (UserId == null || UserId.isEmpty() || FirstName == null || FirstName.isEmpty() || LastName == null || LastName.isEmpty() || email == null || email.isEmpty() || address == null || address.isEmpty() || cellphone == null || cellphone.isEmpty()) {
            return null;
        }





        return new Customer.Builder()
                .setUserId(UserId)
                .setFirstName(FirstName)
                .setLastName(LastName)
                .setEmail(email)
                .setAddress(address)
                .setCellphone(address)
                .build();



    }
    }
