package com.example.zanzan.functional.dto;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
public class MailDto {
    public final String sender;
    public final String title;
}
