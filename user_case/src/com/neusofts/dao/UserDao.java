package com.neusofts.dao;

import com.neusofts.domain.User;

import java.util.List;

public interface UserDao
{
    public List<User> findAll();

    public void add(User user);

    public void update(User user);

    public void delete(int id);
   User findById(int id);
}
