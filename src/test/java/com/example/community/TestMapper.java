package com.example.community;

import com.example.community.dao.DiscussPostMapper;
import com.example.community.dao.LoginTicketMapper;
import com.example.community.dao.MessageMapper;
import com.example.community.dao.UserMapper;
import com.example.community.entity.DiscussPost;
import com.example.community.entity.LoginTicket;
import com.example.community.entity.Message;
import com.example.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class TestMapper {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DiscussPostMapper discussPostMapper;
//    @Autowired
//    private LoginTicketMapper loginTicketMapper;
    @Autowired
    private MessageMapper messageMapper;

    @Test
    public void testMapper() {
        User user = userMapper.selectById(1);
        System.out.println(user.toString());
    }

    @Test
    public void testSelectPosts() {
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(0, 0, 10);
        discussPosts.forEach(discussPost -> System.out.println(discussPost));
        int rows = discussPostMapper.selectDiscussPostRows(0);
        System.out.println(rows);
    }

//    @Test
//    public void testInsertLoginTicket() {
//        LoginTicket loginTicket = new LoginTicket();
//        loginTicket.setUserId(101);
//        loginTicket.setTicket("abc");
//        loginTicket.setStatus(0);
//        loginTicket.setExpired(new Date(System.currentTimeMillis() + 1000 * 60 * 10));
//        int i = loginTicketMapper.insertLoginTicket(loginTicket);
//        System.out.println(i);
//    }

    @Test
    public void testSelectMappers() {
        List<Message> messages = messageMapper.selectConversations(1, 0, 10);
        messages.forEach(message -> System.out.println(message));
    }
}
