package com.cafeteria;


import org.apache.log4j.BasicConfigurator;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Launcher {

    public static void main(String[] args) {
        try {
            BasicConfigurator.configure();
            GenericXmlApplicationContext context =
                    new GenericXmlApplicationContext();
            context.getEnvironment().setActiveProfiles("dev");
            context.load("file:src/main/resources/cafeteria.spring.config.xml");
            context.refresh();
        } catch (Exception e) {
            System.out.print(e.getLocalizedMessage());
        }
    }
}
