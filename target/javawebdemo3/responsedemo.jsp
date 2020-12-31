<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/10/19
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>response demo</title>
</head>
<body>
<%
    //可以防止中文输出乱码
    response.setCharacterEncoding("UTF-8");
    //输出
    PrintWriter writer = response.getWriter();
    writer.write("hello");
    writer.write("中国");
    //页面跳转
    //response.sendRedirect("shows.jsp");
    //页面刷新
    response.setHeader("refresh","1");

%>
<%=new Date()%>
</body>
</html>
