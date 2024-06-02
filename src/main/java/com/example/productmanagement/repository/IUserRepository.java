package com.example.productmanagement.repository;

import com.example.productmanagement.entity.User;

import java.util.List;

public interface IUserRepository {
    List<User> findAll();

    User findLogin(String loginId, String loginPass);
}
