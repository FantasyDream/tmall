package com.tmall.service.impl;

import com.tmall.mapper.UserMapper;
import com.tmall.model.User;
import com.tmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean insert(User user) {
        try {
            userMapper.insert(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            userMapper.delete(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public User get(int id) {
        return userMapper.get(id);
    }

    @Override
    public boolean update(User user) {
        try {
            userMapper.update(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public User selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }


}
