package com.example.shopping.bean;

import lombok.Data;

import java.util.List;

@Data
public class Depart {
    private Integer id;
    private String dname;
    private List<User> userList;
    public Depart(String dname){
        this.dname=dname;
    }
}
