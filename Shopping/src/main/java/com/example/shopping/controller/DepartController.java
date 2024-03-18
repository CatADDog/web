package com.example.shopping.controller;

import com.example.shopping.bean.Depart;
import com.example.shopping.bean.User;
import com.example.shopping.service.DepartService;
import com.example.shopping.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DepartController {
    @Autowired
    DepartService departService;
    @Autowired
    UserService userService;
    @GetMapping("/depart")
    public List<Depart> getAllDepart(){
        List<Depart> departList = departService.getAllDepart();
        for (Depart depart: departList
             ) {
            depart.setUserList(userService.getUserByDepartId(depart.getId()));
        }
        return departList;
    }

    @PostMapping("/delDepart")
    public Integer delDepart(@Param("id") Integer id){
        try{
            departService.delDepartById(id);
            userService.delUserByDepartId(id);
        } catch (Exception e){
            System.out.println(e);
            return -1;//表示删除失败
        }
        return 1;//删除成功
    }


    @PostMapping("/addDepart")
    public Integer addDepart(@RequestParam("dname") String newDepart){
        Depart depart = new Depart(newDepart);
        departService.addDepart(depart);
        return depart.getId();
    }
}
