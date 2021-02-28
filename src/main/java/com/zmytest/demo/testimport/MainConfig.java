package com.zmytest.demo.testimport;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
//@Import(value = {BeanA.class})
//@Import(value = {BeanA.class, MyBeanSelector.class})
@Import(value = {BeanA.class, MyBeanDefinitionRegistry.class})
public class MainConfig {
}
