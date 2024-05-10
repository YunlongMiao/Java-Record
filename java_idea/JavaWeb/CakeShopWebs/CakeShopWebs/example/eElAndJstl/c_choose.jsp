<%--
JSP页面---流程控制标签 如何使用<c:choose>和<c:when>和<c:otherwise>标签
三者作用类似 switch-case语句
--%>

<%@ page language="java" contentType="text/html; charset=utf-8"
         import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head></head>
<body>
<c:choose>
    <c:when test="${empty param.username}">
        unKnown user.
    </c:when>
    <c:when test="${param.username=='itcast' }">
        ${ param.username} is manager.
    </c:when>
    <c:otherwise>
        ${ param.username} is employee.
    </c:otherwise>
</c:choose>
</body>
</html>
