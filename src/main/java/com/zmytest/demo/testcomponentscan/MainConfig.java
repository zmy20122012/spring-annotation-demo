package com.zmytest.demo.testcomponentscan;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
//@ComponentScan(basePackages = "com.zmytest.demo.testcomponentscan")

//@ComponentScan(basePackages = "com.zmytest.demo.testcomponentscan",
//        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class}))

// useDefaultFilters must be false
@ComponentScan(basePackages = "com.zmytest.demo.testcomponentscan",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class}),
                @ComponentScan.Filter(type = FilterType.CUSTOM, value = {MyComponentScanTypeFilter.class})
        }, useDefaultFilters = false)
public class MainConfig {
}
