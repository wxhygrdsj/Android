<%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/12/14
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("username","赵柳");
    request.setAttribute("username","张三");
    session.setAttribute("username","wangu");
    application.setAttribute("username","ky");
%>
${username}
</body>
</html>
