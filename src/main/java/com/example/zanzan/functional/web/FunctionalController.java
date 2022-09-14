package com.example.zanzan.functional.web;

import com.example.zanzan.functional.dto.MailDto;
import com.example.zanzan.functional.dto.MailDtoMapper;
import com.example.zanzan.functional.model.Mail;
import com.example.zanzan.functional.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FunctionalController {

    @Autowired
    private MailService mailService;

    @Autowired
    private MailDtoMapper mailDtoMapper;

    @GetMapping("/normal/get")
    public List<MailDto> getActiveEmail(){
        // isBlankではない全てのメールを取得します
        List<Mail> mails = this.mailService.getActiveMail();
        List<MailDto> mailDtos = new ArrayList<>();
        for(Mail mail : mails){
            mailDtos.add(this.mailDtoMapper.toDto(mail));
        }
        return mailDtos;
    }

    @GetMapping("/functional/get")
    public List<MailDto> getActiveEmailFunctional(){
        // isBlankではない全てのメールを取得します
        return this.mailService.getActiveMailFunctional().stream()
                .map(mailDtoMapper::toDto)
                .collect(Collectors.toList());
    }
}
