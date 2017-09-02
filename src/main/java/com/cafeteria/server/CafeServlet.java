package com.cafeteria.server;

import org.eclipse.jetty.websocket.api.WebSocketPolicy;
import org.eclipse.jetty.websocket.servlet.WebSocketServlet;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;

public class CafeServlet extends WebSocketServlet {

    private final CafeWebSocketCreator cafeWebSocketCreator;

    public CafeServlet(CafeWebSocketCreator cafeWebSocketCreator){
        this.cafeWebSocketCreator = cafeWebSocketCreator;
    }

    public void configure(WebSocketServletFactory webSocketServletFactory) {
        WebSocketPolicy wsp = webSocketServletFactory.getPolicy();
        webSocketServletFactory.setCreator(cafeWebSocketCreator);
        wsp.setIdleTimeout(999999999);
        wsp.setMaxTextMessageBufferSize(999999999);
    }
}
