package com.openisle.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.PropertyMapper;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
class AvatarGeneratorTest {

    @Autowired
    AvatarGenerator avatarGenerator;
    @Test
    void generate() {
        String vcat = avatarGenerator.generate("vcat");
        System.out.println("vcat = " + vcat);
    }
}