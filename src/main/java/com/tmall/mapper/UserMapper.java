package com.tmall.mapper;

import com.tmall.model.User;

import java.util.List;

public interface UserMapper {

    int insert(User user);

    int delete(int id);

    User get(int id);

    int update(User user);

    List<User> list();

    User selectByUsername(String username);
}
