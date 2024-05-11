<%--
  Created by IntelliJ IDEA.
  User: miaoyunlong
  Date: 2024/5/10
  Time: 17:25
  To change this template use File | Settings | File Templates.

  添加用户名文本框和验证按钮
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户输入用户名界面</title>
</head>
<body>
<form action="judge.jsp" method="post" style="font-size: 20px;">
    <li>请输入用户名：<input type="text" name="username"/>
        只能由字母、数字或者下划线组成
    </li>
    <li><input type="submit" name="submit" value="验证"/></li>
</form>
</body>
</html>

