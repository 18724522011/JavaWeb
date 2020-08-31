package com.neusoft.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookieDemo2")
public class CookieDemo2 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {

        Cookie cookie = new Cookie("haha","asdasss");
        cookie.setMaxAge(20);
        //负数设置是默认，默认是cookies、
        //        cookie.setMaxAge(-1);
//        cookie.setMaxAge(0);//删除

//设置一个path让服务器下所有项目共享cookie信息
        resp.addCookie(cookie);

    }
}
