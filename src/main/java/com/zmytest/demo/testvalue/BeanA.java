package com.zmytest.demo.testvalue;

import org.springframework.beans.factory.annotation.Value;

public class BeanA {

    @Value(value = "${myvalue}")
    String name;
    public BeanA(){
        System.out.println("in BeanA constructor");
    }
}
