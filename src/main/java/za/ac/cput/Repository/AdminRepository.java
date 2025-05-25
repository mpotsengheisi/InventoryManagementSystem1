package za.ac.cput.Repository;

import za.ac.cput.Domain.Admin;
import java.util.ArrayList;
import java.util.List;
/*
 * AdminRepository.java
 * Repository implementation for 'Admin'
 * Author: Ryan Paledi (230969429)
 * Date: 25 May 2025
 */

public class AdminRepository implements IAdminRepository{
    private static AdminRepository repository = null;
    private List<Admin> adminList;


    private AdminRepository() {
        adminList = new ArrayList<>();
    }


    public static AdminRepository getInstance() {
        if (repository == null) {
            repository = new AdminRepository();
        }
        return repository;
    }

    @Override
    public Admin create(Admin admin) {
        if (admin == null || admin.getAdminId() == null) {
            return null;
        }

        if (exists(admin.getAdminId())) {
            return null;
        }

        adminList.add(admin);
        return admin;
    }

    @Override
    public Admin read(String adminId) {
        for (Admin admin : adminList) {
            if (admin.getAdminId().equals(adminId)) {
                return admin;
            }
        }
        return null;
    }

    @Override
    public Admin update(Admin admin) {
        if (admin == null) {
            return null;
        }

        int index = findIndexByAdminId(admin.getAdminId());

        if (index == -1) {
            return null;
        }

        adminList.set(index, admin);
        return admin;
    }

    @Override
    public boolean delete(String adminId) {
        int index = findIndexByAdminId(adminId);

        if (index == -1) {
            return false;
        }

        adminList.remove(index);
        return true;
    }

    @Override
    public List<Admin> getAll() {
        return new ArrayList<>(adminList);
    }


    private int findIndexByAdminId(String adminId) {
        for (int i = 0; i < adminList.size(); i++) {
            if (adminList.get(i).getAdminId().equals(adminId)) {
                return i;
            }
        }
        return -1;
    }


    private boolean exists(String adminId) {
        return findIndexByAdminId(adminId) != -1;
    }




}
