<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>listBooks</title>
</head>
<body>
    <form>
        <table align="center" bgcolor="aqua" border="1" cellpadding="0">
            <tr>
                <th width="140">图书Bid</th>
                <th width="140">书名</th>
                <th width="140">作者</th>
                <th width="140">出版社</th>
                <th width="140">修改</th>
                <th width="140">删除</th>
            </tr>
            <c:forEach items="${bookList}" var="b"> <%--varStatus="ct"--%>
                    <tr>
                        <td>${b.bid}</td>
                        <td>${b.bn}</td>
                        <td>${b.author}</td>
                        <td>${b.press}</td>
                        <td><a href="${pageContext.request.contextPath}/books/updatePage/${b.bid}">修改</a></td>
                        <td><a href="${pageContext.request.contextPath}/books/deleteBooksByBid?bid=${b.bid}" onclick='return confirm("确认要删除吗?")'>删除</a></td>
                    </tr>
                </c:forEach>
                <%--<td><a href="${pageContext.request.contextPath}/books/addBooks0">添加图书(跳转页面)</a></td>--%>
        </table>
    </form>
    <form id="saveForm" action="${pageContext.request.contextPath}/books/addBook" method="post">
        <table align="center" bgcolor="aqua" border="1" cellpadding="0">
            <tr>
                <th width="140">书名</th>
                <th width="140">作者</th>
                <th width="140">出版社</th>
            </tr>
            <tr>
                <td width="140"><input type="text" value="${bookadmin.bn}" name="bn"/></td>
                <td width="140"><input type="text" value="${bookadmin.author}" name="author"/></td>
                <td width="140"><input type="text" value="${bookadmin.press}" name="press" /></td>
                <td width="140"><input type="submit" value="添加" /></td>
            </tr>
        </table>
    </form>
</body>
</html>