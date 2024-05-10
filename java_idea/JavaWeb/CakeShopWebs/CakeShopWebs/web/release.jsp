<%--
  Created by IntelliJ IDEA.
  User: miaoyunlong
  Date: 2024/5/10
  Time: 17:16
  To change this template use File | Settings | File Templates.

  对email.jsp页面中表单提交的请求数据进行处理
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>邮件信息</title>
</head>
<body>
<jsp:useBean id="email" class="cn.itcast.Email"></jsp:useBean>
<jsp:useBean id="encoding"
             class="cn.itcast.CharactorEncoding"></jsp:useBean>
<jsp:setProperty name="email" property="*"></jsp:setProperty>
<div align="center">
    <div id="container">
        <div id="title">
            <%=encoding.toString(email.getTitle())%>
        </div>
        <hr>
        <div id="content">
            <%=encoding.toString(email.getContent())%>
        </div>
    </div>
</div>
</body>
</html>

