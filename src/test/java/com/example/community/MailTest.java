package com.example.community;

import com.example.community.util.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.MailSender;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTest {

    @Autowired
    private MailClient mailClient;
    @Autowired(required = false)
    private TemplateEngine templateEngine;

    @Test
    public void testMail() {
        mailClient.sendMail("1746904635@qq.com", "Test", "hello world");
    }

    @Test
    public void testHtmlMail() {
        Context context = new Context();
        context.setVariable("username", "Sunday");
        String content = templateEngine.process("/mail/demo", context);
        System.out.println(content);
        mailClient.sendMail("1210242602@qq.com", "HTML", content);

    }
}
