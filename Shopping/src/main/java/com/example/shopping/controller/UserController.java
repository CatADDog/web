package com.example.shopping.controller;

import com.example.shopping.bean.User;
import com.example.shopping.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Value("${pageSize}")
    int pageSize;
    int pageNum=0;
    @PostMapping("/user")
    public List<User> getAllUser(@Param("index") Integer index) {
        PageHelper.startPage(index, pageSize);
        List<User> users = userService.getAllUser();
        PageInfo<User> pageInfo = new PageInfo<>(users);
        pageNum=pageInfo.getPages();
        return pageInfo.getList();
    }
    @GetMapping("/getPageNum")
    public Integer getPageNum(){
        if(pageNum==0){
            return -1;
        }
        return pageNum;
    }

    @PostMapping("/addUser")
    public Integer addUser(@RequestBody List<User> userList){
        int deptid = Integer.parseInt(userList.get(0).getDname());
        for (User user: userList
             ) {
            user.setDeptid(deptid);
            userService.addUser(user);
        }
        return 1;
    }
}
