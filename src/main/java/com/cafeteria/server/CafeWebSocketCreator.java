package com.cafeteria.server;

import com.cafeteria.controller.RequestController;
import org.eclipse.jetty.websocket.servlet.ServletUpgradeRequest;
import org.eclipse.jetty.websocket.servlet.ServletUpgradeResponse;
import org.eclipse.jetty.websocket.servlet.WebSocketCreator;

public class CafeWebSocketCreator implements WebSocketCreator {

    private final RequestController requestController;

    public CafeWebSocketCreator(RequestController requestController){
        this.requestController = requestController;
    }

    public Object createWebSocket(ServletUpgradeRequest servletUpgradeRequest, ServletUpgradeResponse servletUpgradeResponse) {
        CafeSocket cafeSocket = new CafeSocket(requestController);
        return cafeSocket;
    }
}
