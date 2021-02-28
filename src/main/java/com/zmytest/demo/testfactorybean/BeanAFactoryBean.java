package com.zmytest.demo.testfactorybean;

import org.springframework.beans.factory.FactoryBean;

public class BeanAFactoryBean implements FactoryBean {
    public BeanAFactoryBean() {
        System.out.println("in BeanAFactoryBean constructor");
    }

    @Override
    public Object getObject() throws Exception {
        // 做复杂的初始化工作
        return new BeanA();
    }

    @Override
    public Class<?> getObjectType() {
        return BeanA.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
