<%--
JSP页面---使用<c:out>标签输出默认值
--%>


<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head></head>
<body>
<%--第1个out标签 --%>
userName属性的值为：
<c:out value="${param.username}" default="unknown"/><br />
<%--第2个out标签 --%>
userName属性的值为：
<c:out value="${param.username}">
    unknown
</c:out>
</body>
</html>
