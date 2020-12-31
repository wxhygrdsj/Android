<%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/10/19
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session demo</title>
</head>
<body>
    <%
        /**
         * 用户与服务器的一次交互,有时间限制，通常30分钟
         * setAttribute()
         * getAttribute()
         */
        session.setAttribute("hello2","hello session!");
        response.sendRedirect("shows2.jsp");
        /**
         * 使用session做防盗链，只有认证的用户可以访问，非认证用户不可以访问
         * 轻质访问，给出提示，跳转到登录页面
         */
    %>
</body>
</html>
