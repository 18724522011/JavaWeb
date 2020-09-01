package com.neusofts.web.servlet;


import com.neusofts.domain.User;
import com.neusofts.service.UserService;
import com.neusofts.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取id
        String id = req.getParameter("id");
        // 调用service方法
        UserService service = new UserServiceImpl();
        User user = service.findUserById(id);
        req.setAttribute("user", user);

        // 转发update.jsp

        req.getRequestDispatcher("/update.jsp").forward(req, resp);


    }
}