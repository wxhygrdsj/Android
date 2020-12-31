package edu.njfu.sas.filter;

import edu.njfu.sas.dao.impl.UserDaoImpl;
import edu.njfu.sas.model.User;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.SQLException;

public class AutoLoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;

        Cookie[] cookies = request.getCookies();
        String autoLogin=null;
        for(Cookie c:cookies){
            if(c.getName().equalsIgnoreCase("autoLogin")){
                autoLogin=c.getValue();
            }
        }
        if(autoLogin!=null){
            String[] users=autoLogin.split("-");
            User u=new User(users[0],users[1]);
            try {
                boolean result=new UserDaoImpl().checkLogin(u);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            {
                request.getSession().setAttribute("user",u);
            }
        }else{
            
        }
        filterChain.doFilter(request,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
