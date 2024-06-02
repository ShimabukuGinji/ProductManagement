package com.example.productmanagement.service;

import com.example.productmanagement.entity.Detail;
import com.example.productmanagement.entity.Menu;
import com.example.productmanagement.repository.IMenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MenuService implements IMenuService {

    @Autowired
    private IMenuRepository menuRepository;

    @Override
    public List<Menu> findAll(){
        var menu = menuRepository.findAll();
        return menu;
    }

    @Override
    public Detail findById(int id){
        var menu = menuRepository.findById(id);
        return menu;
    }

    @Override
    public List<Menu> findKeyword(String keyword , int sort) {
        var menu = menuRepository.findKeyword(keyword, sort);
        return menu;
    }


}
