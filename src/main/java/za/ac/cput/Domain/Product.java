package za.ac.cput.Domain;

public class Product {
    private String productId;
    private String name;
    private double price;
    private int quantity;
    private String categoryId;
    private String supplierId;

    private Product() {}

    private Product(Builder builder) {
        this.productId = builder.productId;
        this.name = builder.name;
        this.price = builder.price;
        this.quantity = builder.quantity;
        this.categoryId = builder.categoryId;
        this.supplierId = builder.supplierId;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", categoryId='" + categoryId + '\'' +
                ", supplierId='" + supplierId + '\'' +
                '}';
    }

    public static class Builder {
        private String productId;
        private String name;
        private double price;
        private int quantity;
        private String categoryId;
        private String supplierId;

        public Builder setProductId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Builder setSupplierId(String supplierId) {
            this.supplierId = supplierId;
            return this;
        }

        public Builder copy(Product product) {
            this.productId = product.productId;
            this.name = product.name;
            this.price = product.price;
            this.quantity = product.quantity;
            this.categoryId = product.categoryId;
            this.supplierId = product.supplierId;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}

