package com.example.zanzan.functional.dto;

import com.example.zanzan.functional.model.Mail;
import org.springframework.stereotype.Component;

@Component
public class MailDtoMapper {
    public MailDto toDto(Mail mail){
        return new MailDto(mail.getSender(),mail.getTitle());
    }
}
