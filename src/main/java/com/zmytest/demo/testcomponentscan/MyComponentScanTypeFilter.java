package com.zmytest.demo.testcomponentscan;

import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyComponentScanTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        // 获取当前类的annotation信息
//        metadataReader.getAnnotationMetadata()

        // 获取当前类的资源信息
//        Resource resource = metadataReader.getResource();

        // 获取当前类的 class 信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();

        return classMetadata.getClassName().contains("Bean");
    }
}
