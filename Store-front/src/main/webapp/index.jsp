<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%
    String basePath = request.getContextPath();
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="WEB-INF/js/jquery-1.12.3.min.js"></script>
<html>
<head>
    <title>欢迎来到主页</title>
</head>
<body>
<form id="login" action="${pageContext.request.contextPath}/buyer/login.do" method="get">
    <table id="usermessage" border="1">
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username" value="username" required/></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="text" name="password" value="password" required/></td>
        </tr>
        <tr><input type="submit" value="提交"/></tr>
        <tr><input type="button" value="忘记密码"/></tr>
    </table>
</form>
</body>
</html>
