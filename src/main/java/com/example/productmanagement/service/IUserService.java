package com.example.productmanagement.service;

import com.example.productmanagement.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {
    List<User> findAll();

    User findLogin(String loginId, String loginPass);
}
