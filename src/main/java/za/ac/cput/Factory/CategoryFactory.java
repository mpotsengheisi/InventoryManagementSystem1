package za.ac.cput.Factory;

import za.ac.cput.Util.Helper;
/*Category.java
Category Factory class
Author: Ahluma Nkqayi (222512571)
Date: 18 May 2025
 */
import za.ac.cput.Domain.Category;

public class CategoryFactory {
    public static Category createCategory(String categoryId, String description) {
        if (Helper.isNullOrEmpty(categoryId) || Helper.isNullOrEmpty(description)) {
            return null;
        }

        return new Category.Builder()
                .setCategoryId(categoryId)
                .setDescription(description)
                .build();
    }
}