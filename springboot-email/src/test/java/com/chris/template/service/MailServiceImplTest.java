package com.chris.template.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceImplTest {

    @Autowired
    private MailService mailSerivce;
    
    @Test
    public void testSendEmial() {
        mailSerivce.sendEmail("xxx@qq.com", "吃饭了吗?", "哈哈！");
        
    }

}
