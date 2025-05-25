package za.ac.cput.Service;

/*
ICategoryService.java
Service interface for Category
Author: Ahluma Nkqayi (222512571)
Date: 24 May 2025
*/

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Category;

import java.util.List;

@Service
public interface ICategoryService extends IService<Category, String> {
    List<Category> getAll();
}
