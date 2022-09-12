package com.example.zanzan.sample;

import jdk.jfr.DataAmount;

import javax.persistence.*;

@Entity
@Table(name="stocks")
public class Stock {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name="name")
    public String name;
}
