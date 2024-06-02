package com.example.productmanagement.service;

import com.example.productmanagement.entity.Detail;
import com.example.productmanagement.entity.Menu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IMenuService {
    List<Menu> findAll();

    Detail findById(int id);

    List<Menu> findKeyword(String keyword , int sort);
}
