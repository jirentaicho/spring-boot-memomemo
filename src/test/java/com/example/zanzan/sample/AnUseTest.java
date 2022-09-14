package com.example.zanzan.sample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AnUseTest {

    @Autowired
    private AnUse anUse;

    @Autowired
    private SetBind setBind;

}