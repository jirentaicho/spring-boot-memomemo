package com.example.zanzan.functional.service;

import com.example.zanzan.functional.entity.MailEntity;
import com.example.zanzan.functional.model.Mail;
import com.example.zanzan.functional.model.MailMapper;
import com.example.zanzan.functional.repository.MailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
public class MailServiceImpl implements MailService{

    @Autowired
    private MailRepository mailRepository;

    @Autowired
    private MailMapper mailMapper;

    @Override
    public List<Mail> getActiveMail() {
        List<MailEntity> mailEntities = mailRepository.getAllMail();
        List<Mail> mails = new ArrayList<>();
        for(MailEntity entity : mailEntities){
            mails.add(this.mailMapper.toMail(entity));
        }
        List<Mail> activeMails = new ArrayList<>();
        for(Mail mail : mails){
            if(mail.isBlankMail()){
                continue;
            }
            activeMails.add(mail);
        }
        return activeMails;
    }


    @Override
    public List<Mail> getActiveMailFunctional() {
        return mailRepository.getAllMail().stream()
                .map(mailMapper::toMail)
                .filter(Predicate.not(Mail::isBlankMail))
                .collect(Collectors.toList());
    }
}
