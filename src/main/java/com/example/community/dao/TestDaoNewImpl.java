package com.example.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary    //使其获得更高的优先级
public class TestDaoNewImpl implements TestDao{

    @Override
    public String select() {
        return "666666";
    }
}
