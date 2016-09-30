<%--
  Created by IntelliJ IDEA.
  User: myg
  Date: 2016/9/26
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getContextPath();
%>
<html>
<script type="text/javascript" src="../js/jquery-1.12.3.min.js"/>
<head>
    <title>登录</title>
    <script>
        function register(){
            window.location.href = "${basePath}/jsp/register.jsp";
        }
    </script>
</head>
<body>
<form id="login" action="${pageContext.request.contextPath}/login/register.do" method="post">
    <table id="usermessage" border="1">
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username" value="username" required/></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="text" name="password" value="password" required/></td>
        </tr>
        <tr><input type="button" value="登录" onclick="submit"/></tr>
        <tr><input type="button" value="注册" onclick="register()"/> </tr>
    </table>
</form>
</body>
</html>
