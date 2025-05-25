package za.ac.cput.Service;
import java.util.List;
import za.ac.cput.Domain.Admin;
/*
 * IAdminService.java
 * Author: Ryan Paledi (230969429)
 * Date: 25 May 2025
 */


public interface IAdminService extends IService <Admin, String>{
    List<Admin> getAll();
}
