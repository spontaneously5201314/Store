<%--
  Created by IntelliJ IDEA.
  User: myg
  Date: 2016/9/21
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<%
    String basePath = request.getContextPath();
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script>
        function listUsers(){

        }
    </script>
</head>
<body>
    <form>
        查看用户：<input type="button" onclick="listUsers()" value="查看用户"/>
    </form>
</body>
</html>
