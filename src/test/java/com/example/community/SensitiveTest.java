package com.example.community;

import com.example.community.util.SensitiveFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class SensitiveTest {

    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void sensitiveTest() {
        String test = "这里可以※赌※博※，可以嫖👉娼，可以吸毒，可以开票，哈哈哈！";
        String filter = sensitiveFilter.filter(test);
        System.out.println(filter);
    }
}
