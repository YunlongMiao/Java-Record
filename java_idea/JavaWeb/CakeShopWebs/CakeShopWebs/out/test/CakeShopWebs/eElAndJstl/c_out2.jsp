<%--
JSP页面---使用<c:out>标签的escapeXml属性对特殊字符进行转义
--%>

<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head></head>
<body>
<c:out value="${param.username }" escapeXml="true">
    <meta http-equiv="refresh"
          content="0;url=http://www.itcast.cn" />
</c:out>
</body>
</html>
