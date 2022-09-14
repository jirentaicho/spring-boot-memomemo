package com.example.zanzan.functional.entity;

import javax.persistence.*;

@Entity
@Table(name="mails")
public class MailEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "sender")
    public String sender;

    @Column(name ="title")
    public String title;
}
