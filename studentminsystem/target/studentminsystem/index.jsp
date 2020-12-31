<%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/11/24
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<%--<%--%>
<%--    request.getRequestDispatcher("/WEB-INF/jsp/liststudents.jsp").forward(request,response);--%>
<%--%>--%>
<%--<a href="/studentminsystem/noaccess">展示学生列表</a>--%>
<%
    request.getRequestDispatcher("/studentminsystem/noaccess").forward(request,response);
%>
</body>
</html>
