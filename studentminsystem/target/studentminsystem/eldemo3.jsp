<%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/12/14
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${param.username},${param.password}
${paramValues.get("username")}
<%
    Cookie cookie = new Cookie("username", "张三");
    cookie.setMaxAge(60*60*24);
    response.addCookie(cookie);
%>


</body>
</html>
