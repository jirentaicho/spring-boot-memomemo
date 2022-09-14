package com.example.zanzan.functional.repository;

import com.example.zanzan.functional.entity.MailEntity;

import java.util.List;

public interface MailRepository {
    List<MailEntity> getAllMail();
}
