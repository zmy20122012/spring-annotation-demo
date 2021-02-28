package com.zmytest.demo.testprofile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        // -Dspring.profiles.active=test
//        ctx.getEnvironment().setActiveProfiles("test");
        ctx.register(MainConfig.class);
        ctx.refresh();
        ctx.close();
    }
}
