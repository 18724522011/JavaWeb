package com.neusoft.cookie.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/sessionDemo2")
public class SessionDemo2 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
   this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        HttpSession session = req.getSession();
        Object msg = session.getAttribute("msg");
        System.out.println(msg);
        //期望客户端关闭后，session也能相同
        Cookie cookie = new Cookie("session",session.getId());
        cookie.setMaxAge(30);
        resp.addCookie(cookie);
    }
}
