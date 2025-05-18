package za.ac.cput.Factory;
/*Category.java
Category Factory class
Author: Ahluma Nkqayi (222512571)
Date: 18 May 2025
 */
import za.ac.cput.Domain.Category;
import za.ac.cput.Util.Helper;

public class CategoryFactory {
    public static Category createCategory(String categoryId, String description) {
        if (!Helper.isValidCategoryData(categoryId, description)) {
            return null;
        }

        return new Category.Builder()
                .setCategoryId(categoryId)
                .setDescription(description)
                .build();
    }
}



