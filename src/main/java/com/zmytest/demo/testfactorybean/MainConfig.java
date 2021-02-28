package com.zmytest.demo.testfactorybean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// eg SQLSessionFactoryBean

@Configuration
public class MainConfig {

    @Bean
    public BeanAFactoryBean beanAFactoryBean(){
        return new BeanAFactoryBean();
    }
}
