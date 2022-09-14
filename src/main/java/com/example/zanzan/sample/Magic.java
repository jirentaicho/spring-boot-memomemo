package com.example.zanzan.sample;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

@Component
public class Magic {
    @InitBinder
    public String hoge(WebDataBinder webDataBinder){
        return "aaaaa";
    }
}
