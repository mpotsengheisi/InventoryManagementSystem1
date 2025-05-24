package za.ac.cput.Factory;
/*
CategoryFactoryTest.java
Test for CategoryFactory
Author: Ahluma Nkqayi (222512571)
Date: 18 May 2025
*/

import org.junit.Test;
import za.ac.cput.Domain.Category;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CategoryFactoryTest {

    @Test
    public void createCategory() {
        Category category = CategoryFactory.createCategory("C001", "Electronics");
        System.out.println("Created Category: " + category);
        assertNotNull(category.getCategoryId());
    }
}