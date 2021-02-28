package com.zmytest.demo.testcomponentscan;

import org.springframework.stereotype.Service;

@Service
public class BeanA {

    public BeanA(){
        System.out.println("in BeanA constructor");
    }
}
