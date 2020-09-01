package com.neusofts.dao;


import com.neusofts.domain.User;

import java.util.List;

public interface UserDao
{
    public List<User> findAll();
}
