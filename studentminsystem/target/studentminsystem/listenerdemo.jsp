<%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/12/8
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>监听器页面测试</title>
</head>
<body>
<%
    application.setAttribute("username","zhangsan");
    application.setAttribute("username","lisi");
    application.removeAttribute("username");

    session.setAttribute("username","zhangsan");
    session.setAttribute("username","lisi");
    session.removeAttribute("username");
%>
</body>
</html>
