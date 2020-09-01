package com.neusofts.service.impl;
import com.neusofts.dao.UserDao;
import com.neusofts.dao.impl.UserDaoImpl;
import com.neusofts.domain.User;
import com.neusofts.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService
{
    private UserDao dao = new UserDaoImpl();
    @Override
    public List<User> findAll()
    {
        //调用dao

        return   dao.findAll();
    }
}
