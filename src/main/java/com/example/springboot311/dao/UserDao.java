package com.example.springboot311.dao;

import com.example.springboot311.model.User;

import java.util.List;

public interface UserDao {
    void createUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    User readUser(int id);

    List<User> getUsers();

    User getUserByName(String name);

}
