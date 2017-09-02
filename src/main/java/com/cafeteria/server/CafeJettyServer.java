package com.cafeteria.server;


import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.*;

import javax.annotation.PostConstruct;

public class CafeJettyServer {
    private final CafeServlet cafeServlet;

    public CafeJettyServer(CafeServlet cafeServlet){
        this.cafeServlet = cafeServlet;
    }

    @PostConstruct
    public void Start(){
        final org.eclipse.jetty.server.Server server = new org.eclipse.jetty.server.Server();
        ServerConnector serverConnector = new ServerConnector(server);
        serverConnector.setPort(4567);
        server.addConnector(serverConnector);
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        servletContextHandler.setContextPath("/");
        ServletHolder servletHolder = new ServletHolder(cafeServlet);
        servletContextHandler.addServlet(servletHolder,"/cafe/");
        server.setHandler(servletContextHandler);
        Thread serverThread = new Thread(() ->
                {
                    try {
                        server.start();
                        server.dump(System.err);
                        server.join();
                    }
                    catch (Exception e){

                    }
                });
        serverThread.setDaemon(true);
        serverThread.setName("CafeServerThread");
        serverThread.start();
    }
}
