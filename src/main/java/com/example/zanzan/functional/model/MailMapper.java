package com.example.zanzan.functional.model;

import com.example.zanzan.functional.entity.MailEntity;
import org.springframework.stereotype.Component;

@Component
public class MailMapper {

    public Mail toMail(MailEntity mailEntity){
        return new Mail(mailEntity.sender,mailEntity.title);
    }
}
