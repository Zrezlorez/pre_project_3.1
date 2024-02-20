package com.litovskiy.preproject3_1.dao;


import com.litovskiy.preproject3_1.model.User;

import java.util.List;

public interface UserDao  {
    User getById(Long id);
    void add(User user);
    void delete(Long Id);
    void update(User user);
    List<User> getAllUsers();
}
