<%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/10/13
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>out对象demo</title>
</head>
<body>
    <%
        out.print("hello world<br>");
        out.write("软件<br>");
        out.flush();//nitice!
    %>
<script>
    document.write("这是javascrip打印<br>")
</script>
<%
    response.getWriter().write("这是response getWriter输出结果<br>");
%>

</body>
</html>
