<%@ page import="dao.UserDao" %>
<%@ page import="model.User" %><%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/9/29
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String userName=request.getParameter("username");
    String password=request.getParameter("password");
    User user=new User(userName,password);
    UserDao userDao = new UserDao();
    boolean result = userDao.saveUser(user);
    //根据保存的结果返回信息给用户
    if(result){
        //跳转Success
        response.sendRedirect("success.jsp");
    }else {
        //跳转error
        response.sendRedirect("error.jsp");
    }
%>
