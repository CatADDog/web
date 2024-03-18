package com.example.shopping.mapper;

import com.example.shopping.bean.User;

import java.util.List;

public interface UserMapper {
    List<User> getAllUser();
    List<User> getUserByDepartId(Integer id);

    void delUserByDepartId(Integer id);

    void addUser(User user);
}
