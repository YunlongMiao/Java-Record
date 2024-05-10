<%--
  Created by IntelliJ IDEA.
  User: miaoyunlong
  Date: 2024/5/10
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>

<%--
JSP页面---EL对jsp页面书写的简化作用-对比
--%>

<%@ page language="java" contentType="text/html; charset=utf-8" %>
<html>
<head></head>
<body>
用户名：<%=request.getAttribute("username")%><br/>
密 码：<%=request.getAttribute("password")%><br/>
<hr/>
使用EL:<br/>
用户名：${username}<br/>
密 码：${password}<br/>
</body>
</html>

