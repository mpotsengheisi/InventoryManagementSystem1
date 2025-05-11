package za.ac.cput.Domain;


public class Inventory {

    private Long id;
    private Long productId;
    private int quantity;
    private int reorderLevel;

    private Inventory() {}

    private Inventory(Builder builder) {
        this.productId = builder.productId;
        this.quantity = builder.quantity;
        this.reorderLevel = builder.reorderLevel;
    }

    // Getters
    public Long getId() {
        return id;
    }
    public Long getProductId() {
        return productId;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getReorderLevel() {
        return reorderLevel;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", reorderLevel=" + reorderLevel +
                '}';
    }

    // Builder class
    public static class Builder {
        private Long productId;
        private int quantity;
        private int reorderLevel;

        public Builder withProductId(Long productId) {
            this.productId = productId;
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
        public Inventory build() {
            if (productId == null) {
                throw new IllegalArgumentException("Product ID cannot be null");
            }
            return new Inventory(this);
        }
    }
}

