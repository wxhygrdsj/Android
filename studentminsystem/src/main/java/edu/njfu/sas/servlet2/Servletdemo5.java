package edu.njfu.sas.servlet2;

import edu.njfu.sas.dao.impl.UserDaoImpl;
import edu.njfu.sas.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/Servletdemo5")
public class Servletdemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(userName, password);
        UserDaoImpl userDao=new UserDaoImpl();
        boolean result= false;
        try {
            result = userDao.checkLogin(user);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if(result){
            request.getRequestDispatcher("/liststudents.jsp").forward(request,response);
            //response.sendRedirect("liststudents.jsp");
        }else {
            PrintWriter out=response.getWriter();
            out.write("<script>alert('登陆失败!');location.href='index.jsp'</script>");

        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}