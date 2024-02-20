package com.litovskiy.preproject3_1.service;

import com.litovskiy.preproject3_1.model.User;

import java.util.List;

public interface UserService {
    User getById(Long id);
    void add(User user);
    void delete(Long id);
    void update(User user);
    List<User> getAllUsers();
}
