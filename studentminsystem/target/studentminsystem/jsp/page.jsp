<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="../../css/style1-1.css">
<ul>
    <li><a href="liststudentsbypaging.jsp?page=1">首 页  </a> </li>
    <%
        if(currentPage!=1){
    %>
    <li><a href="liststudentsbypaging.jsp?page=<%=currentPage-1%>">上一页 </a> </li>
    <%
        }
    %>
    <%
        if(currentPage!=pageUtil.getMaxPage()){
    %>
    <li><a href="liststudentsbypaging.jsp?page=<%=currentPage+1%>">下一页 </a> </li>
    <%
        }
    %>
    <li><a href="liststudentsbypaging.jsp?page=<%=pageUtil.getMaxPage()%>">尾 页  </a> </li>
    <li style="width: 300px">
        <form action="liststudentsbypaging.jsp" method="post">
<%--            跳转到<input type="text" name="page" size="2">页--%>
<%--            <input type="submit" name="submit" value="确定">--%>
            跳转到<select name="page" id="selectPage">
                <option>请选择</option>
                </select>页
        <input type="submit" name="submit" value="确定">
        </form>
    </li>
</ul>
<%
    /**
     * currentpage与pagesize进行求模
     */
%>
<script>
    function insertPage(element,maxPage){
        for(i=1;i<=maxPage;i++){
            element.options.add(new Option(i,i));
        }
    }
    insertPage(document.getElementById("selectPage"),"<%=pageUtil.getMaxPage()%>")
</script>
<%
    int second=pageUtil.getCurrentPage();
    int max=pageUtil.getMaxPage();
    System.out.println(max);
    if(second==1){
        second=2;
    }
    if(second+3>max){
        second=max-2;
    }
    for(int i=second-1;i<second+3;i++){
%>
<a href="liststudentsbypaging.jsp?page=<%=i%>"><%=i%>&nbsp;</a>
<%
    }
%>