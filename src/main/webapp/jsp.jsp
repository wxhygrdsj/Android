<%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/9/29
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    out.println("helo world<br> 58666");
    for(int i=0;i<9;i++){
        for(int j=1;j<=i;j++){
            out.print(i+"*"+j+"="+i*j+"&nbsp;&nbsp;");
        }
        out.print("<br>");
    }
%>
</body>
</html>
