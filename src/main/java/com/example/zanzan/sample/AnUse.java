package com.example.zanzan.sample;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.InitBinder;

@Component
public class AnUse {

    @EasyBind
    private MyBean myBean;

    public void hoge(){
        System.out.println(this.myBean.getName());
    }

}
