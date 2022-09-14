package com.example.zanzan.functional.repository;

import com.example.zanzan.functional.entity.MailEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MailRepositoryImpl implements MailRepository{

    @Autowired
    private MailJpa mailJpa;

    @Override
    public List<MailEntity> getAllMail() {
        return mailJpa.findAll();
    }
}
