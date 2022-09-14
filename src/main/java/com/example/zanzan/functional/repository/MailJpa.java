package com.example.zanzan.functional.repository;

import com.example.zanzan.functional.entity.MailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailJpa extends JpaRepository<MailEntity,Integer> {
}
