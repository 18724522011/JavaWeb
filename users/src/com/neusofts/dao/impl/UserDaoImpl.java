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

        String sql="select * from user";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return template.query(sql,new BeanPropertyRowMapper<User>(User.class));
    }
}
