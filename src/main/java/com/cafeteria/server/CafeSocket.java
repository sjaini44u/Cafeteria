package com.cafeteria.server;

import com.cafeteria.controller.RequestController;
import com.cafeteria.requests.RequestMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.WebSocketAdapter;


public class CafeSocket extends WebSocketAdapter {

    ObjectMapper requestMapper = new ObjectMapper();

    private final RequestController requestController;
    public CafeSocket(RequestController requestController){
        this.requestController = requestController;
    }

    @Override
    public void onWebSocketConnect(Session session){
        //do caching of sessions with their ids

    }

    @Override
    public void onWebSocketClose(int statusCode, String reason){

    }

    @Override
    public void onWebSocketError(Throwable cause) {
    }


    @Override
    public void onWebSocketText(String message) {
        try {
           RequestMessage requestMessage = requestMapper.readValue(message, RequestMessage.class);
           requestController.processRequestMessage(requestMessage, getSession());
        } catch (Exception e) {
            System.out.print("Exception occured " + e.getLocalizedMessage());
        }
    }
}
