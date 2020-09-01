package com.neusofts.service;

import com.neusofts.domain.User;

import java.util.List;

public interface UserService
{
    public List<User> findAll();

    public void addUser(User user);

    public void updateUser(User user);

    public void deleteUser(int id);
    User findUserById(String id);
}
