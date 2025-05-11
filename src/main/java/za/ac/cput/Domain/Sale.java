package za.ac.cput.Domain;


import java.time.LocalDateTime;

public class Sale {

    private Long id;

    private Long productId;
    private int quantity;
    private String transactionType;
    private LocalDateTime transactionDate;

    private Sale() {

    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", transactionType='" + transactionType + '\'' +
                ", transactionDate=" + transactionDate +
                '}';
    }

    private Sale(Builder builder) {
        this.productId = builder.productId;
        this.quantity = builder.quantity;
        this.transactionType = builder.transactionType;
        // Use the provided transaction date or default to now.
        this.transactionDate = builder.transactionDate != null ? builder.transactionDate : LocalDateTime.now();
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
    public String getTransactionType() {
        return transactionType;
    }
    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    // Builder class
    public static class Builder {
        private Long productId;
        private int quantity;
        private String transactionType;
        private LocalDateTime transactionDate;

        public Builder withProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Builder withQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }
        public Builder withTransactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }
        public Builder withTransactionDate(LocalDateTime transactionDate) {
            this.transactionDate = transactionDate;
            return this;
        }
        public Sale build() {
            if (productId == null) {
                throw new IllegalArgumentException("Product ID cannot be null");
            }
            if (transactionType == null || transactionType.trim().isEmpty()) {
                throw new IllegalArgumentException("Transaction type cannot be null or empty");
            }
            return new Sale(this);
        }
    }
}

