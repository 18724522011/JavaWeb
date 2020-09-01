package com.neusofts.web.servlet;

import com.neusofts.domain.User;
import com.neusofts.service.UserService;
import com.neusofts.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/updateUserServlet")
public class UpdateUserServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
       //1.设置编码
        req.setCharacterEncoding("utf-8");

      // 2.获取参数
        Map<String, String[]> map = req.getParameterMap();
//        String name = req.getParameter("name");
//        String gender = req.getParameter("gender");
//       String  age = req.getParameter("age");
//        String address = req.getParameter("address ");
//        String qq = req.getParameter("qq");
//        String email = req.getParameter("email");

        //3.封装成对象
        User user = new User();
//        user.setName(name);
//        user.setGender(gender);
//        user.setAge(Integer.parseInt(age));
//        user.setAddress(address);
//        user.setQq(qq);
//        user.setEmail(email);
        try
        {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e)
        {
            e.printStackTrace();
        } catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
        //4调用service add方法
        UserService service = new UserServiceImpl();
        service.updateUser(user);
        //5重定向list.jsp
        resp.sendRedirect(req.getContextPath()+"/userListServlet");
    }
}
