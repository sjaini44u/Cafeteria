package com.cafeteria.server;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.WebSocketAdapter;


public class CafeSocket extends WebSocketAdapter {
    @Override
    public void onWebSocketConnect(Session session){
    }

    @Override
    public void onWebSocketClose(int statusCode, String reason){
    }

    @Override
    public void onWebSocketError(Throwable cause) {
    }

    @Override
    public void onWebSocketText(String message) {
    }
}
