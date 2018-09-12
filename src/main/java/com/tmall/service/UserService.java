package com.tmall.service;

import com.tmall.model.User;

import java.util.List;

public interface UserService {

    boolean insert(User user);

    boolean delete(int id);

    User get(int id);

    boolean update(User user);

    List<User> list();

    User selectByUsername(String username);

}
