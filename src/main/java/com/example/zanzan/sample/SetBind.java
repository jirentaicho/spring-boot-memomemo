package com.example.zanzan.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.support.DefaultDataBinderFactory;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.method.support.HandlerMethodArgumentResolverComposite;

import javax.annotation.PostConstruct;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Set;

// これをPOSTメソッドの前に発火させる必要がある
@Component
public class SetBind {


    /*
    private WebDataBinder webDataBinder;

    @InitBinder
    public void hofge(WebDataBinder webDataBinder){
        this.webDataBinder = webDataBinder;
    }

     */
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) throws ClassNotFoundException {
        // アノテーションがついてるクラスを指定して取得する
        Class clazz = Class.forName("com.example.zanzan.sample.SampleController");
        // 全てのフィールドを取得する
        for(Field field : clazz.getDeclaredFields()){
            // easyBindがついてるフィールドを特定する
            if(field.isAnnotationPresent(EasyBind.class)){
                Validator a = (Validator) applicationContext.getBean(field.getType());
            }
        }
        System.out.println("----end---");
    }



    @Autowired
    private ApplicationContext applicationContext;

    // リフレクションで全てのEasyBindを取得する
    public void initEasyBind() throws ClassNotFoundException {
        // アノテーションがついてるクラスを指定して取得する
        Class clazz = Class.forName("com.example.zanzan.sample.SampleController");
        // 全てのフィールドを取得する
        for(Field field : clazz.getDeclaredFields()){
            // easyBindがついてるフィールドを特定する
            if(field.isAnnotationPresent(EasyBind.class)){
                System.out.println(field);
                Validator a = (Validator) applicationContext.getBean(field.getType());
                //WebDataBinder webDataBinder = applicationContext.getBean(WebDataBinder.class);

                //webDataBinder.addValidators(a);
            }
        }
        System.out.println("----end---");
    }


}
