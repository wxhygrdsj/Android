<%@ page import="edu.njfu.sas.model.Student" %>
<%@ page import="edu.njfu.sas.dao.impl.StudentDaoImpl" %><%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/11/1
  Time: 0:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("utf-8");
    String stuno = request.getParameter("stuno");
    String stuname = request.getParameter("stuname");
    String classes = request.getParameter("classes");
    String gender = request.getParameter("gender");
    String department = request.getParameter("department");
    String tel = request.getParameter("tel");
    String dormno = request.getParameter("dormno");
    out.println(stuno+stuname+classes+gender+department+tel+dormno);
    Student s=new Student(stuno,stuname,classes,gender,department,tel,dormno,"10");
    boolean tf=new StudentDaoImpl().updateStudent(s);
    if(tf==true){
        response.sendRedirect("liststudents.jsp");
    }else{
        response.sendRedirect("index.jsp");
    }
%>
