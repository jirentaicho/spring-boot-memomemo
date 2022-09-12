package com.example.zanzan.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.DriverManager;

@Configuration
public class BeanConfig {
    @Bean
    public MyBean myBean() {
        return new MyBean("Admin");
    }


}
