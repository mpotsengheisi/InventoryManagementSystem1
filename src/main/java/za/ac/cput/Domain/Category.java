package za.ac.cput.Domain;

/* Category.java
   Category model class
   Author: Ahluma Nkqayi (222512571)
   Date: 11 May 2025
*/

public class Category {
    private final String categoryId;
    private final String description;

    private Category(Builder builder) {
        this.categoryId = builder.categoryId;
        this.description = builder.description;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId='" + categoryId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {
        private String categoryId;
        private String description;

        public Builder setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder copy(Category category) {
            this.categoryId = category.categoryId;
            this.description = category.description;
            return this;
        }

        public Category build() {
            return new Category(this);
        }
    }
}