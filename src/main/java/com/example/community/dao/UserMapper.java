package com.example.community.dao;

import com.example.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectById(Integer id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(Integer id, String headerUrl);

    int updatePassword(Integer id, String password);

}
