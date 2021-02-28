package com.zmytest.demo.testconditional;


import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;


@Configuration
public class MainConfig {

    @Bean
    public BeanA beanA() {
        return new BeanA();
    }

    @Bean
    @Conditional(value = BeanCondition.class)
//    @ConditionalOnMissingBean(value = BeanA.class)
    public BeanB beanB() {
        return new BeanB();
    }
}
