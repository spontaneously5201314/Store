<%--
  Created by IntelliJ IDEA.
  User: myg
  Date: 2016/9/28
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getContextPath();
%>
<html>
<head>
    <title>注册</title>
    <script type="text/javascript" src="/WEB-INF/js/jquery-1.12.3.min.js"/>
</head>
<body>
    <form action="${basePath}/buyer/registerBuyer.do" method="post">
        <table>
            <tr>
                <td>用户名：<input type="text" name="username" value="username" placeholder="请输入用户名" checked/></td>
            </tr>
            <tr>
                <td>密码：<input type="text" name="password" value="password" placeholder="请输入密码" checked/></td>
            </tr>
            <tr>
                <td>邮箱：<input type="email" name="email" value="email" placeholder="请输入邮箱" checked/></td>
            </tr>
            <tr><input type="submit" value="提交"/></tr>
        </table>
    </form>
</body>
</html>
