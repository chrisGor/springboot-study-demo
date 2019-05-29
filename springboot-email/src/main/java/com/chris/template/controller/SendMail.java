package com.chris.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chris.template.service.MailService;

@RestController
public class SendMail {

    @Autowired
    private MailService mailService;

    @GetMapping("/send")
    public String sendMail() {
        this.mailService.sendEmail("xxx@qq.com", "Spring Boot Test", "Hello World");
        return "send";
    }
}
