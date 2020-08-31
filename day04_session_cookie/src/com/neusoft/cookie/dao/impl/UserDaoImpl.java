package com.neusoft.cookie.dao.impl;



import com.neusoft.cookie.dao.UserDao;
import com.neusoft.cookie.domain.User;
import com.neusoft.cookie.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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