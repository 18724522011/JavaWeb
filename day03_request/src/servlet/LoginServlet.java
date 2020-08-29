package servlet;

import com.neusoft.servlet.dao.UserDao;
import com.neusoft.servlet.dao.impl.UserDaoImpl;
import com.neusoft.servlet.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        //1.设置编码
        req.setCharacterEncoding("utf-8");
        //2.获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //封装成对象
        User loginUser=new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);
        UserDao dao=new UserDaoImpl();
         User user=null;
        try{
        user = dao.login(loginUser);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        if(user==null){
           req.getRequestDispatcher("/failServlet").forward(req,resp);

       }else{
           req.setAttribute("user",user);
           req.getRequestDispatcher("/successServlet").forward(req,resp);
       }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doGet(req, resp);
    }
}
