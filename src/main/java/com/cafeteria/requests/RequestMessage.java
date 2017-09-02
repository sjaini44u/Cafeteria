package com.cafeteria.requests;

import com.cafeteria.domain.model.Order;
import com.cafeteria.domain.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestMessage {

    private final String requestType;
    private final UserInfo userInfo;
    private final Order order;

    @JsonCreator
    public RequestMessage(@JsonProperty("requestType") String requestType,
                          @JsonProperty("userInfo")UserInfo userInfo,
                          @JsonProperty("order")Order order ){
        this.order = order;
        this.userInfo = userInfo;
        this.requestType = requestType;
    }
    public String getRequestType() {
        return requestType;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public Order getOrder() {
        return order;
    }
}
