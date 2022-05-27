package com.example.community.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype")     //每次getBean的时候都新创建一个实例
public class TestService {

    public TestService() {
        System.out.println("实例化TestService");
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化TestService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁TestService");
    }

}
