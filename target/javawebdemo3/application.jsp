<%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/10/19
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>网站访问次数统计</title>
</head>
<body>
<%
    Object count=session.getAttribute("count");//application
    if(count==null){
        count=1;
        session.setAttribute("count",count);
    }else{
        count=(Integer)count+1;
        session.setAttribute("count",count);
    }
    /**
     * page<request<session<application
     */
%>
    <h1>你是本网站第<%=count%>位访问用户</h1>

</body>
</html>
