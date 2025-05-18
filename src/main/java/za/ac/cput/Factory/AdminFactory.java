package za.ac.cput.Factory;
/*
Author: Ryan Paledi Kgapjane (230969429)
Date:
 */
import za.ac.cput.Domain.Admin;


public class AdminFactory {
    public static Admin createAdmin(String AdminId, String UserName, String password, String role) {
        if (AdminId == null || AdminId.isEmpty() || UserName == null || UserName.isEmpty() || password == null || password.isEmpty() || role == null || role.isEmpty()) {
            return null;
        }


        return new Admin.Builder()
                .setAdminId(AdminId)
                .setUserName(UserName)
                .setPassword(password)
                .setRole(role)
                .build();


    }
}
