package com.neusoft.servlet.test;

import com.neusoft.servlet.dao.impl.UserDaoImpl;
import com.neusoft.servlet.domain.User;
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
