package com.example.zanzan.sample;

import org.springframework.stereotype.Component;

@Component
public class UserRespositoryImpl implements UserRepository{
    @Override
    public String get() {
        return "admin";
    }
}
