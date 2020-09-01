package com.neusofts.web.servlet;

import com.neusofts.service.UserService;
import com.neusofts.service.impl.UserServiceImpl;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse
;
import java.io.IOException;

@WebServlet("/deleteUserServlet")
public class DeleteUserServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {

        String id = req.getParameter("id");
        System.out.println(id);
        //   resp.sendRedirect(req.getContextPath()+"/userListServlet");
        UserService service = new UserServiceImpl();
        service.deleteUser(Integer.parseInt(id));
        //5重定向list.jsp
        resp.sendRedirect(req.getContextPath() + "/userListServlet");
    }
}
