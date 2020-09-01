package com.neusofts.servlet.test;

import com.neusofts.servlet.dao.impl.UserDaoImpl;
import com.neusofts.servlet.domain.User;
import org.junit.Test;



public class UserDaoTest
{
    @Test
    public void test(){
        User loginUser=new User();
        loginUser.setUsername("张三");
        loginUser.setPassword("123");
        UserDaoImpl dao=new UserDaoImpl();
        User user = dao.login(loginUser);
        System.out.println(user);
    }
}
