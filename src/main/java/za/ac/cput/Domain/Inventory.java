package za.ac.cput.Domain;


public class Inventory {

    private String inventoryId; // Unique identifier for Inventory
    private String productId;
    private String productName;
    private double price;
    private String category;
    private String supplier;
    private int quantity;
    private int reorderLevel;
    private String reason;

    private Inventory() {}

    private Inventory(Builder builder) {
        this.productId = builder.productId;
        this.quantity = builder.quantity;
        this.reorderLevel = builder.reorderLevel;
        this.productName = builder.productName;
        this.price = builder.price;
        this.category = builder.category;
        this.supplier = builder.supplier;
        this.reason = builder.reason;
        this.inventoryId = builder.inventoryId; // Set during build
    }

    // Getters
    public String getInventoryId() {
        return inventoryId;
    }
    public String getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
    public String getSupplier() {
        return supplier;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getReorderLevel() {
        return reorderLevel;
    }
    public String getReason() {
        return reason;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "inventoryId='" + inventoryId + '\'' +
                ", productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", supplier='" + supplier + '\'' +
                ", quantity=" + quantity +
                ", reorderLevel=" + reorderLevel +
                ", reason='" + reason + '\'' +
                '}';
    }

    // Builder class
    public static class Builder {
        private String inventoryId; // optional, can be set by factory
        private String productId;
        private String productName;
        private double price;
        private String category;
        private String supplier;
        private int quantity;
        private int reorderLevel;
        private String reason;

        public Builder withProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public Builder withProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public Builder withPrice(double price) {
            this.price = price;
            return this;
        }
        public Builder withCategory(String category) {
            this.category = category;
            return this;
        }
        public Builder withSupplier(String supplier) {
            this.supplier = supplier;
            return this;
        }
        public Builder withQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }
        public Builder withReorderLevel(int reorderLevel) {
            this.reorderLevel = reorderLevel;
            return this;
        }
        public Builder withReason(String reason) {
            this.reason = reason;
            return this;
        }
        public Builder withInventoryId(String inventoryId) {
            this.inventoryId = inventoryId;
            return this;
        }

        public Inventory build() {
            return new Inventory(this);
        }
    }
}