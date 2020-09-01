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
    @Test
    public void test2(){
        User user=new User();
        user.setName("ddd");
        user.setGender("啊啊");
        user.setAge(14);
        user.setAddress("沈阳");
        user.setQq("667678867");
        user.setEmail("33435@qq.com");


        UserDao dao = new UserDaoImpl();
        dao.add(user);
    }
    @Test
    public void test3(){

    }
}
