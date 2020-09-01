package com.neusofts.servlet.dao.impl;

import com.neusofts.servlet.dao.UserDao;
import com.neusofts.servlet.domain.User;
import com.neusofts.servlet.utils.JDBCUtils;

import java.sql.*;

public class UserDaoImpl implements UserDao
{
    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private User user = null;


    @Override
    public User login(User loginUser)
    {
        String sql = "select * from userlogin where username = ? and password = ?";
        try
        {
            conn = JDBCUtils.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, loginUser.getUsername());
            pstmt.setString(2, loginUser.getPassword());
            rs = pstmt.executeQuery();
            while (rs.next())
            {
                user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        } finally
        {
            JDBCUtils.close(rs, pstmt, conn);
        }
        return user;
    }
}