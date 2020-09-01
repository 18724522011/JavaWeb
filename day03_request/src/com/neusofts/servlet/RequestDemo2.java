package com.neusofts.servlet;

        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
@WebServlet("/requestDemo2")
public class RequestDemo2  extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        //转发资源
//        req.getRequestDispatcher("/requestDemo3").forward(req,resp);
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/requestDemo3");
//        dispatcher.forward(req,resp);
        //转法时存数据
        req.setAttribute("msg","hello");
        req.getRequestDispatcher("/requestDemo3").forward(req,resp);


    }
}
