package com.example.community.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "oldImpl")
public class TestDaoImpl implements TestDao{

    @Override
    public String select() {
        return "666";
    }
}
