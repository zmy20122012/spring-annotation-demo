package com.zmytest.demo.testscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);

        BeanA beanA = (BeanA) ctx.getBean("beanA");
        BeanA beanA1 = (BeanA) ctx.getBean("beanA");
        System.out.println(beanA == beanA1);
        ctx.close();
    }
}
