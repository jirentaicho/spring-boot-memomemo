package com.example.zanzan.functional.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Mail {
    private final String sender;
    private final String title;

    public boolean isBlankMail(){
        return title.isBlank();
    }

    @Override
    public String toString(){
        return "送信者 : " + sender + " タイトル : " + title;
    }
}