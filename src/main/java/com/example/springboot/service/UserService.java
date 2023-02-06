package com.example.springboot.service;

import com.example.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User saveUser(User user);

    void deleteById(Long id);

    User findById(Long id);
}
