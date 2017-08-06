package com.cafeteria.domain.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private final String name;
    private final String role;
    private final String customerId;

    public String getCustomerId() {
        return customerId;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    @JsonCreator
    public User(@JsonProperty("name") String name,
                @JsonProperty("role") String role,
                @JsonProperty("customerId") String customerId) {
        this.name = name;
        this.role = role;
        this.customerId = customerId;
    }

}
