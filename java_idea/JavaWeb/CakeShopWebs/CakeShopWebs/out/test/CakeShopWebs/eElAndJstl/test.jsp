<%--
JSP页面---测试JSTL，使用taglib指令引入Core标签库，在该文件中使用<c:out>标签
--%>

<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head></head>
<body>
<c:out value="Hello World!"></c:out>
</body>
</html>