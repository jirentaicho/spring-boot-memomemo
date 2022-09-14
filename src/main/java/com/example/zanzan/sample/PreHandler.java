package com.example.zanzan.sample;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Aspect
@Component
public class PreHandler {
    @Autowired
    private SetBind setBind;

    @Before("execution(* *..*SampleController.*(..))")
    public void before(JoinPoint joinpoint) {
        try {
            this.setBind.initEasyBind();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("取得します");
    }
}
