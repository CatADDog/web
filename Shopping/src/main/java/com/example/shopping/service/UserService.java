package com.example.shopping.service;

import com.example.shopping.bean.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    List<User> getUserByDepartId(Integer id);

    void delUserByDepartId(Integer id);
    void addUser(User user);
}
