package com.zmytest.demo.testbean;


import org.springframework.context.annotation.Bean;

public class MainConfig {
    @Bean
    public BeanA getA(){
        return new BeanA();
    }
}
