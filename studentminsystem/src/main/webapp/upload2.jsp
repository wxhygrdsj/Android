<%--
  Created by IntelliJ IDEA.
  User: Lghy
  Date: 2020/12/21
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传照片</title>
    <style>
        #img01{
            display: none;
        }
    </style>
</head>
<body>
<form>
    请上传照片:<input type="file" id="uploadfile" name="uploadfile"/>
</form>
<img src="" id="img01" style="width: 300px;height: 300px"/>
<img src="http://localhost:8080/"/>
<script>
    //var uploadfiles=document.getElementById("uploadfile").files;
    var img01=document.getElementById("img01");
    uploadfile.addEventListener("change",function (){
        var uploadfiles=document.getElementById("uploadfile").files;
        var reader=new FileReader();
        reader.readAsDataURL(uploadfiles[0]);
        reader.onload=function (){
            img01.src=reader.result;
            img01.style.display="block";
        }
    });
</script>
</body>
</html>
