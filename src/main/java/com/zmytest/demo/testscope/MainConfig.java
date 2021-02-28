package com.zmytest.demo.testscope;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;


@Configuration
public class MainConfig {

    @Bean
    @Lazy
//    @Scope(scopeName = "prototype")
    public BeanA beanA(){
        return new BeanA();
    }
}
