package com.example.zanzan.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class ConfigSample implements WebMvcConfigurer {

    @Autowired
    private PreMethodHandler preMethodHandler;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(preMethodHandler)
                .addPathPatterns("/save");
    }
}
