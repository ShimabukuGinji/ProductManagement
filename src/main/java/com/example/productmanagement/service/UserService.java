package com.example.productmanagement.service;

import com.example.productmanagement.entity.User;
import com.example.productmanagement.repository.IUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;
    @Override
    public List<User> findAll(){
        var users = userRepository.findAll();
        return users;
    }

    @Override
    public User findLogin(String loginId, String loginPass){
        var user = userRepository.findLogin(loginId, loginPass);
        return user;
    }
}
