package com.neusoft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/requestDemo6")
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
        //获取所有请求参数名称
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            System.out.println(name);
            System.out.println("++++++++++++");
            String value = req.getParameter(name);
            System.out.println(value);
            System.out.println("++++++++++++");

        }


//        Map<String, String[]> parameterMap = req.getParameterMap();
//        Set<String> keySet = parameterMap.keySet();
//        for(String name:keySet){
//
//            String[] values=parameterMap.get(name);
//            System.out.println(name);
//            for(String value:values){
//                System.out.println(value);
//            }
//            System.out.println("+++++++++++++");
//        }
    }
}
