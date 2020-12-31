<%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/10/20
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=page.hashCode()%>
<br>
<%=page.getClass().toString()%>
<%
    /**
     * hashcode:内存地址经过hash函数后得到数值，是内存地址经过hash函数变幻后的结果
     * hashcode作用：为了快速查找对象
     *
     * 创建学生类，包含stuNo,stuName,department
     * 重写Student类equals方法，规定，只要stuNo与StuName相同，则认为这两个对象相等
     */
    /**
     * 通过page演示，jsp页面最终转换为java类，
     */
%>
</body>
</html>
