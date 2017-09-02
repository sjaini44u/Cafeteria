package com.cafeteria.domain.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInfo {

    private final String customerId;
    private final String password;

    @JsonCreator
    public UserInfo(@JsonProperty("customerId") String customerId,
                    @JsonProperty("password") String password) {
        this.customerId = customerId;
        this.password = password;
    }

}
