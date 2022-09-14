package com.example.zanzan.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.DelegatingMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.RequestHandledEvent;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.annotation.PostConstruct;
import java.util.Set;

@RestController
public class SampleController{

    @Autowired
    private ApplicationContext applicationContext;

    //@Autowired
    //private MyBean myBean;

    @Autowired
    private SampleLogic sampleLogic;

    @PostConstruct
    private void postcon(){
        // ok
        //sampleLogic.init("admin");
    }

    @GetMapping("/sample")
    public String aaaa(){

       // System.out.println(myBean.getName());
        return "ok";
    }

   // @EasyBind
   // private SaveValidator saveValidator;

   // @Autowired
    //private SetBind setBind;

    @Autowired
    private Magic magic;


    @Autowired
    private SaveValidator saveValidator;

    @InitBinder
    public void validatorBinder(WebDataBinder webDataBinder){
        webDataBinder.addValidators(this.saveValidator);
    }
     

    @PostMapping("/save")
    public String save(@Validated @RequestBody SaveForm saveForm, BindingResult bindingResult) throws Exception {
        if(bindingResult.hasErrors()){
            bindingResult.getAllErrors().stream().forEach(System.out::println);
            throw new Exception();
        }
        ///System.out.println(saveForm);
        return "ok";
    }

}
