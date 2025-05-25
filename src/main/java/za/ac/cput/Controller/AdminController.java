package za.ac.cput.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Domain.Admin;
import za.ac.cput.Domain.Product;
import za.ac.cput.Service.AdminService;


import java.util.List;

/*
 * AdminController.java
 * Author: Ryan Paledi (230969429)
 * Date: 25 May 2025
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/create")
    public Admin create(@RequestBody Admin admin) {
        return adminService.create(admin);
    }

    @GetMapping("/read/{adminId}")
    public Admin read(@PathVariable String adminId) {
        return adminService.read(adminId);
    }

    @PostMapping("/update")
    public Admin update(@RequestBody Admin admin) {
        return adminService.update(admin);
    }

    @DeleteMapping("/delete/{adminId}")
    public void delete(@PathVariable String adminId) {
        adminService.delete(adminId);
    }

    @GetMapping("/getAll")
    public List<Admin> getAll() {
        return adminService.getAll();
    }

}
