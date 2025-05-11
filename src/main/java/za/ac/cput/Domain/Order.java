package za.ac.cput.Domain;

import java.util.ArrayList;
import java.util.List;

// "order" is a reserved keyword in many databases so we use "orders"
public class Order {

    private Long id;
    private Long customerId;
    private List<Long> productIds;
    private String status;


    private Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", productIds=" + productIds +
                ", status='" + status + '\'' +
                '}';
    }

    // Private constructor that accepts a builder
    private Order(Builder builder) {
        this.customerId = builder.customerId;
        this.productIds = builder.productIds;
        this.status = builder.status;
    }

    // Getters for accessing fields

    public Long getId() {
        return id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public List<Long> getProductIds() {
        return productIds;
    }

    public String getStatus() {
        return status;
    }

    // Optionally, setters are available if you need them for any reason.
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setProductIds(List<Long> productIds) {
        this.productIds = productIds;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Builder Pattern implementation for fluent object construction
    public static class Builder {
        private Long customerId;
        private List<Long> productIds = new ArrayList<>();
        private String status = "NEW"; // default status

        public Builder withCustomerId(Long customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder withProductIds(List<Long> productIds) {
            this.productIds = productIds;
            return this;
        }

        // Adds a single product ID to the list
        public Builder addProductId(Long productId) {
            this.productIds.add(productId);
            return this;
        }

        public Builder withStatus(String status) {
            this.status = status;
            return this;
        }

        public Order build() {
            if (customerId == null) {
                throw new IllegalArgumentException("Customer ID cannot be null");
            }
            if (productIds == null || productIds.isEmpty()) {
                throw new IllegalArgumentException("At least one product ID is required");
            }
            return new Order(this);
        }
    }
}

