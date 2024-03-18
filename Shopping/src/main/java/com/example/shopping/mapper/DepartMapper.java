package com.example.shopping.mapper;

import com.example.shopping.bean.Depart;

import java.util.List;

public interface DepartMapper {
    List<Depart> getAllDepart();
    void delDepartById(Integer id);
    void addDepart(Depart depart);
}
