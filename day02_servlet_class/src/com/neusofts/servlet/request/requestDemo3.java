package com.neusofts.servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/requestDemo3")
public class requestDemo3 extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        //1.获取请求方式
        String method=req.getMethod();
        System.out.println("method"+method);
        //2.获取虚拟目录
        String contextPath=req.getContextPath();
        //项目名
        System.out.println("ContextPath"+contextPath);
        //3.获取servlet路径
        String servletPath=req.getServletPath();
        System.out.println("ServletPath"+servletPath);
        //4.获取get方式请求参数
        String queryString=req.getQueryString();
        System.out.println("QueryString"+queryString);
        //5.获取URI
        String requestURI=req.getRequestURI();
        StringBuffer requestURL=req.getRequestURL();
        System.out.println("RequestURI"+requestURI);
        System.out.println("RequestURL"+requestURL);
        //6.获取协议版本
        String protocol=req.getProtocol();
        System.out.println("Protocol"+protocol);
        //7.获取客户机ip地址
        String remoteAddr=req.getRemoteAddr();
        System.out.println("RemoteAddr"+remoteAddr);
    }
}
