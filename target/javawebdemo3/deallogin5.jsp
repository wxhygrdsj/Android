<%@ page import="java.sql.*" %>
<%@ page import="dao.UserDao" %>
<%@ page import="model.User" %><%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/9/21
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //获取用户名密码
    String userName=request.getParameter("username");
    String password=request.getParameter("password");
    //创建一个UserDao对象
    UserDao userDao=new UserDao();
    if(userDao.checkLogin(new User(userName,password))){
        //out.println("用户名密码正确");
        session.setAttribute("user","userName");
        response.sendRedirect("njfu.jsp");
    }else {
        out.println("<script>alert('用户名密码错误');location.href='login.html'</script>");
    }

%>
