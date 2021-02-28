package com.zmytest.demo.testfactorybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);

        Object beanA = ctx.getBean("beanAFactoryBean");
        System.out.println(beanA);
        Object beanA2 = ctx.getBean("&beanAFactoryBean");
        System.out.println(beanA2);

        ctx.close();
    }
}
