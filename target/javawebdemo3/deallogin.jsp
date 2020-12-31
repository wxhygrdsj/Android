<%--
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
    //out.print("你输入的用户名与密码为："+userName+":"+password);
    if(userName!=null&&password.equals("123456")){
        out.print("用户名与密码正确");
    }else{
        out.print("密码错误");
    }
%>
