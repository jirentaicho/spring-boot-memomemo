package com.example.zanzan.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String getUser(){
        return this.userRepository.get();
    }
}
