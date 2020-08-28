package com.neusoft.servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/requestDemo1")
public class RequestDemo1 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
      String userName=req.getParameter("username");
        System.out.println(userName);
        String passWord=req.getParameter("password");
        System.out.println(passWord);
        String[] hobbies=req.getParameterValues("hobby");
        for(String hobby:hobbies){
            System.out.println(hobby);
        }
    }
}
