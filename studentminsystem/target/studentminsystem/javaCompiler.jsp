<%@ page import="edu.njfu.sas.test.CR" %><%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/12/27
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>java</title>
    <link rel="stylesheet" href="css/CR.css">
    <script src="js/jquery-3.5.1.min.js"></script>
    <script src="js/cr-js.js"></script>
</head>
<body>
    <form action="javaCompiler.jsp" method="post">
        <h1>代码输入框: </h1><br>
        <textarea id="code" name="code"></textarea>
<%--        <input type="button" value="run" id="btn" name="btn">--%>
        <input type="submit" value="run" id="submit" name="submit">
        <input type="reset" value="reset" id="reset" name="reset">
        <input type="button" value="pre" id="btn" name="btn">
    </form>
<%
    request.setCharacterEncoding("utf-8");
    String submit = request.getParameter("submit");%>
    <%
    if(submit!=null &&submit.equals("run")){
        String s=request.getParameter("code");
        out.write(request.getParameter("code"));
        CR cr=new CR(s);
        cr.test();

    }else{

    }
%>
</body>
</html>
