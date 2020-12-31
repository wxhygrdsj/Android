<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/9/21
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //获取用户名密码
    String userName=request.getParameter("username");
    String password=request.getParameter("password");
    //连接数据库
    /**
     * Connection 对象,不能通过new创建
     *
     */
    Class.forName("com.mysql.cj.jdbc.Driver");
    //获取connection对象
    //url:"jdbc:mysql://ip:port/dbname"
    String url="jdbc:mysql://localhost:3306/software18?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    String dbName="root";
    String dbPassword="wxhygrdsj";
    Connection conn= DriverManager.getConnection(url,dbName,dbPassword);
    String sql="select * from tbl_user where userName=? and password=?";
    PreparedStatement pst=conn.prepareStatement(sql);
    pst.setString(1,userName);
    pst.setString(2,password);
    ResultSet resultSet=pst.executeQuery();
    String userName1="",password1="";
    while (resultSet.next()){
        //out.print(resultSet.getString(1)+","+resultSet.getString(1)+","+resultSet.getString(1)+"<br>");
         userName1= resultSet.getString("userName");
         password1= resultSet.getString("password");
        //out.print("你输入的用户名与密码为："+userName+":"+password)
        if(userName.equals(userName1)&&password.equals(password1)){
            out.print("用户名与密码正确");
            break;
        }else{
            out.print("密码错误");
            break;
        }
    }


%>
