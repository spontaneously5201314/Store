<%--
  Created by IntelliJ IDEA.
  User: myg
  Date: 2016/9/21
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%
    String basePath = request.getContextPath();
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="WEB-INF/js/jquery-1.12.3.min.js"></script>
<html>
<head>
    <title>Title</title>
   <%-- <script>
        $("#listUsers").ajax({
            type: "get",
            url: "{basePath}/login/listUsers.html",
            async: true
        });
        $(document).ready(function () {
            $("#toPage").click(function () {
                alert(basePath);
                location.href = "{basePath}/WEB-INF/jsp/login.jsp";
            });
        });
    </script>--%>
    <script>
        window.onload = function{
            function toLogin(){
                window.Location.href = "${basePath}/WEB-INF/jsp/login.jsp";
            }
        }
    </script>
</head>
<body>

跳转：<a href="WEB-INF/jsp/login.jsp" name="跳转">跳转</a>
<%--<form>
    查看用户：<input id="listUsers" type="button" onclick="listUsers()" value="查看用户"/>
</form>
跳转：<input id="toPage" type="button" onclick="toPage()"/>
<form id="users">
</form>--%>
<form id="login" action="${pageContext.request.contextPath}/login/listUsers.do" method="post">
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
    </table>
</form>
</body>
</html>
