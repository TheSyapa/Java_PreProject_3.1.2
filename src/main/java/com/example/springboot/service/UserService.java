package com.example.springboot.service;

import com.example.springboot.model.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();

    public User saveUser(User user);

    public void deleteById(Long id);

    public User findById(Long id);
}
