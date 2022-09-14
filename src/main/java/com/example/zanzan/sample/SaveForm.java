package com.example.zanzan.sample;

import javax.validation.Constraint;

public class SaveForm {
    public String name;
    public String message;

    // lombokを使うのが良
    public String getName(){
        return this.name;
    }

    public String getMessage(){
        return this.message;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMessage(String message){
        this.message = message;
    }
}
