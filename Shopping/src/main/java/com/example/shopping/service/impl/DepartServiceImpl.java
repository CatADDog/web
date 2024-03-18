package com.example.shopping.service.impl;

import com.example.shopping.bean.Depart;
import com.example.shopping.mapper.DepartMapper;
import com.example.shopping.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartServiceImpl implements DepartService {
    @Autowired
    private DepartMapper departMapper;
    @Override
    public List<Depart> getAllDepart() {
        return departMapper.getAllDepart();
    }

    @Override
    public void delDepartById(Integer id) {
        departMapper.delDepartById(id);
    }

    @Override
    public void addDepart(Depart depart) {
        departMapper.addDepart(depart);
    }
}
