package com.zmytest.demo.testvalue;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:application.yml")
public class MainConfig {


    @Bean
    public BeanA beanA() {
        return new BeanA();
    }
}
