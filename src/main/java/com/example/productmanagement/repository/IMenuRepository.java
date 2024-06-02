package com.example.productmanagement.repository;

import com.example.productmanagement.entity.Detail;
import com.example.productmanagement.entity.Menu;

import java.util.List;

public interface IMenuRepository {
    List<Menu> findAll();

    Detail findById(int id);
    List<Menu> findKeyword(String keyword , int sort);

}
