package com.cafeteria.domain.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {

    private final String orderId;
    private final String foodItemId;
    private final String customerId;
    private final int quantity;

    public String getOrderId() {
        return orderId;
    }

    public String getFoodItemId() {
        return foodItemId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public int getQuantity() {
        return quantity;
    }

    @JsonCreator
    public Order(@JsonProperty("orderId") String orderId,
                 @JsonProperty("foodItemId") String foodItemId,
                 @JsonProperty("customerId")String customerId,
                 @JsonProperty("qty") int quantity) {
        this.orderId = orderId;
        this.foodItemId = foodItemId;
        this.customerId = customerId;
        this.quantity = quantity;
    }


}
