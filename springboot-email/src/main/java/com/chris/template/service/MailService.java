package com.chris.template.service;

public interface MailService {

    public void sendEmail(String to, String subject, String content);
}
