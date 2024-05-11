<%--
  Created by IntelliJ IDEA.
  User: miaoyunlong
  Date: 2024/3/12       2024/5/10
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>

<%--
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$JAVA 项目开发$</title>
  </head>
  <body>
  计21-2-11 苗云龙<br>
  正在认真学习JAVA 项目开发 课程
  </body>
</html>

--%>

<%@ page language="java" contentType="text/html; charset=utf-8"
         import="java.util.*"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <title>显示登录的用户信息</title>
</head>
<body>
<br />
<center>
  <h3>欢迎光临</h3>
</center>
<br />
<br />
<c:choose>
  <c:when test="${sessionScope.user==null }">
    <a href="${pageContext.request.contextPath }/login.jsp">用户登录</a>
  </c:when>
  <c:otherwise>
    欢迎你，${sessionScope.user.username }!
    <a href="${pageContext.request.contextPath }/LogoutServlet">注销</a>
  </c:otherwise>
</c:choose>
<hr />
</body>
</html>