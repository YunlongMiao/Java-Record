<%--
JSP页面---如何获取Cookie对象中的信息
${cookie.userName }
${cookie.userName.name }
${cookie.userName.value }
--%>

<%@ page language="java" contentType="text/html; charset=utf-8"%>
<html>
<head></head>
<body>
Cookie对象的信息：<br />
${cookie.userName } <br />
Cookie对象的名称和值：<br />
${cookie.userName.name }=${cookie.userName.value }
<% response.addCookie(new Cookie("userName", "itcast")); %>
</body>
</html>
