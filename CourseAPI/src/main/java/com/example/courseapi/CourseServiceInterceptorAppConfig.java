package com.example.courseapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class CourseServiceInterceptorAppConfig extends WebMvcConfigurerAdapter {
    @Autowired
    CourseServiceInterceptor courseServiceInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(courseServiceInterceptor);
    }
}