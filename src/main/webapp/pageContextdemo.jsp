<%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/10/20
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    /**
     * 可以通过pageContext,获取其他八中对象
     */
    //get out
    JspWriter out1=pageContext.getOut();
    out1.print("hello world");
    //get request
    ServletRequest request1=pageContext.getRequest();
    //get response
    ServletResponse response1= pageContext.getResponse();
    response1.getWriter().write("hello");
    //get exception
    Exception exception=pageContext.getException();

    //get page
    Object page1 = pageContext.getPage();
    //get conf
    ServletConfig servletConfig = pageContext.getServletConfig();
    //get session
    HttpSession session1 = pageContext.getSession();
    //get application
    ServletContext servletContext = pageContext.getServletContext();
    request.setAttribute("user","requestUser");
    session.setAttribute("user","sessionUser");
    application.setAttribute("user","applicationUser");
    out.print(pageContext.findAttribute("user"));
    /**
     * 使用pageContext.findAttribute()方法查找，范围从小到大。
     */

%>

</body>
</html>
