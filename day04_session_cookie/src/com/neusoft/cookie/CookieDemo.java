package com.neusoft.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/cookieDemo")
public class CookieDemo extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        Cookie cookie1 = new Cookie("id","aadd");
        Cookie cookie2 = new Cookie("id","张多少呢");

        //发送添加cookie
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
        //获取cookie
    }
}
