package com.example.zanzan.functional.service;

import com.example.zanzan.functional.model.Mail;

import java.util.List;

public interface MailService {
    List<Mail> getActiveMail();
    List<Mail> getActiveMailFunctional();
}
