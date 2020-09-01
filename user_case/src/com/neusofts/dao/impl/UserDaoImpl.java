package com.neusofts.dao.impl;

import com.neusofts.dao.UserDao;
import com.neusofts.domain.User;
import com.neusofts.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao
{
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll()
    {

        String sql = "select * from user";
//    List<User> users=  template.query(sql,new BeanPropertyRowMapper<User>(User.class));

        return template.query(sql, new BeanPropertyRowMapper<User>(User.class));
    }

    @Override
    public void add(User user)
    {
        String sql = "insert into user values(null,?,?,?,?,?,?,null,null)";
        template.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail());
    }

    @Override
    public void update(User user)
    {
        String sql = "update  user set name=?,gender=?,age=?,address=?,qq=?,email=? where id=? ";
        template.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail(), user.getId());
    }

    @Override
    public void delete(int id)
    {
        String sql = "delete from user where id=?";
        template.update(sql, id);
    }

    @Override
    public User findById(int id)
    {
        String sql = "select * from user where id=?";
        return  template.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),id);//
    }


}
