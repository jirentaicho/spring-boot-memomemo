package com.example.zanzan.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @Component
public class PreMethodHandler implements HandlerInterceptor {

    @Autowired
    private SetBind setBind;


    @Override
    public boolean preHandle (HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        this.setBind.initEasyBind();

        return true;
    }
}
