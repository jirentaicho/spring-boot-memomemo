package com.example.zanzan.sample;

import org.springframework.stereotype.Component;

@Component
public class SampleLogicImpl implements SampleLogic{

    @Override
    public void init(String name) {
        System.out.println(name);
    }

    @Override
    public void execute() {
        System.out.println("execute");
    }
}
