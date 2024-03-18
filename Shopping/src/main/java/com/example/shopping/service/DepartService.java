package com.example.shopping.service;

import com.example.shopping.bean.Depart;

import java.util.List;

public interface DepartService {
    List<Depart> getAllDepart();
    void delDepartById(Integer id);
    void addDepart(Depart depart);
}
