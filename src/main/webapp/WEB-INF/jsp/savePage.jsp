<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加图书</title>
</head>
<body>
<br/>
<form id="saveForm" action="${pageContext.request.contextPath}/books/addBook" method="post">
    <table  align="center" bgcolor="aqua" border="1" cellpadding="0">
        <tr>
            <td>书名：</td>
            <td><input type="text" value="${bookadmin.bn}" name="bn"/></td>
        </tr>
        <tr>
            <td>作者：</td>
            <td><input type="text" value="${bookadmin.author}" name="author"/></td>
        </tr>
        <tr>
            <td>出版社：</td>
            <td><input type="text" value="${bookadmin.press}" name="press" /></td>
        </tr>
        <input type="submit" value="添加" />
    </table>
</form>
</body>
</html>