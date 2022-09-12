package com.example.zanzan.sample;

import org.apache.coyote.Request;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;


@Component
public class CustomEventListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof ContextRefreshedEvent){
            System.out.println("Beanライフサイクルが初期化されました");
        } else if(event instanceof RequestHandledEvent){
            System.out.println("http通信が行われました");
        }
    }

}