package za.ac.cput.Domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;



/*
Author: Luhlumr Iarlaith Keamogetse Radebe(222804424)
date:
 */

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderId;
    private String customerId;
    private Date orderDate;
    private List<Inventory> itemsOrdered;
    private double amountPaid;
    private String orderItems;
    private List<Long> productIds;
    private String status;
    private String deliveryAddress;
    private String paymentMethod;

    // Private constructor
    private Order() {
    }

    // Constructor used by Builder
    private Order(Builder builder) {
        this.orderId = builder.orderId;
        this.customerId = builder.customerId;
        this.orderDate = builder.orderDate;
        this.itemsOrdered = builder.itemsOrdered;
        this.amountPaid = builder.amountPaid;
        this.orderItems = builder.orderItems;
        this.productIds = builder.productIds;
        this.status = builder.status;
        this.deliveryAddress = builder.deliveryAddress;
        this.paymentMethod = builder.paymentMethod;
    }




    // Getters
    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public List<Inventory> getItemsOrdered() {
        return itemsOrdered;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public String getOrderItems() {
        return orderItems;
    }

    public List<Long> getProductIds() {
        return productIds;
    }

    public String getStatus() {
        return status;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    // Setters (optional, if needed)
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", orderDate=" + orderDate +
                ", itemsOrdered=" + itemsOrdered +
                ", amountPaid=" + amountPaid +
                ", orderItems='" + orderItems + '\'' +
                ", productIds=" + productIds +
                ", status='" + status + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }

    // Builder class
    public static class Builder {
        private String orderId;
        private String customerId;
        private Date orderDate = new Date(); // default to now
        private List<Inventory> itemsOrdered = new ArrayList<>();
        private double amountPaid;
        private String orderItems;
        private List<Long> productIds = new ArrayList<>();
        private String status = "NEW"; // default
        private String deliveryAddress;
        private String paymentMethod;

        public Builder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setOrderDate(Date orderDate) {
            this.orderDate = orderDate;
            return this;
        }

        public Builder setItemsOrdered(List<Inventory> itemsOrdered) {
            this.itemsOrdered = itemsOrdered;
            return this;
        }

        public Builder setAmountPaid(double amountPaid) {
            this.amountPaid = amountPaid;
            return this;
        }

        public Builder setOrderItems(String orderItems) {
            this.orderItems = orderItems;
            return this;
        }

        public Builder setProductIds(List<Long> productIds) {
            this.productIds = productIds;
            return this;
        }

        public Builder setProductId(Long productId) {
            this.productIds.add(productId);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Order build() {
            return new Order(this);
        }

        public Order copy(Order order) {
            this.orderId = order.orderId;
            this.customerId = order.customerId;
            this.orderDate = order.orderDate;
            this.itemsOrdered = order.itemsOrdered;
            this.amountPaid = order.amountPaid;
            this.orderItems = order.orderItems;
            this.productIds = order.productIds;
            this.status = order.status;
            this.deliveryAddress = order.deliveryAddress;
            this.paymentMethod = order.paymentMethod;
            return this.build();
        }
    }
}
