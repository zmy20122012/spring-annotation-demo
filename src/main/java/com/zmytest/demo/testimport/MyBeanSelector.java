package com.zmytest.demo.testimport;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

// 就可以实现自动装配。
public class MyBeanSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.zmytest.demo.testimport.BeanB"};
    }
}
