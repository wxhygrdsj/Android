package edu.njfu.sas.servlet2;

import edu.njfu.sas.dao.impl.UserDaoImpl;
import edu.njfu.sas.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(username, password);
        try {
            boolean result = new UserDaoImpl().checkLogin(user);
            if(result){
                request.getSession().setAttribute("user",user);
                String autologin=request.getParameter("autologin");
                if(autologin!=null){
                    Cookie cookie = new Cookie("autologin", username + "-" + password);
                    cookie.setMaxAge(Integer.parseInt(autologin));
                    cookie.setPath(request.getContextPath());
                    response.addCookie(cookie);


                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
