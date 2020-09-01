package com.neusofts.test;
import com.neusofts.dao.UserDao;
import com.neusofts.dao.impl.UserDaoImpl;
import com.neusofts.domain.User;
import org.junit.Test;

import java.util.List;

public class TestUserDaoImpl
{
    @Test
    public void userDaoImplTest(){
        UserDao dao = new UserDaoImpl();
        List<User> users = dao.findAll();
        for( User user:users){
            System.out.println(user);
        }
    }
}
