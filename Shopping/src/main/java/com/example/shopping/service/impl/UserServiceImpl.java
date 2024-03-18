package com.example.shopping.service.impl;

import com.example.shopping.bean.User;
import com.example.shopping.mapper.UserMapper;
import com.example.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public List<User> getUserByDepartId(Integer id) {
        return userMapper.getUserByDepartId(id);
    }

    @Override
    public void delUserByDepartId(Integer id) {
        userMapper.delUserByDepartId(id);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
