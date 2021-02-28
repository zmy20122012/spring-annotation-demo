package com.zmytest.demo.testprofile;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MainConfig {

    @Bean
    @Profile(value = "test")
    public BeanA beanA() {
        return new BeanA();
    }

    @Bean
    @Profile(value = "prod")
    public BeanB beanB() {
        return new BeanB();
    }
}
