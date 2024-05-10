<%--
JSP页面---循环标签 分别使用<c:forEach>标签迭代数组和Map集合

首先需要在数组和Map集合中添加几个元素，然后将数组赋值给＜c:forEach＞标签的items属性，
而Map集合对象同样赋值给＜c:forEach＞标签的items属性，之后使 用EL获取Map集合中的键和值
--%>


<%@ page language="java" contentType="text/html; charset=utf-8"
         import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head></head>
<body>
<%
    String[] fruits = { "apple", "orange", "grape", "banana" };
%>
String数组中的元素：
<br />
<c:forEach var="name" items="<%=fruits%>">
    ${name}<br />
</c:forEach>
<%
    Map userMap = new HashMap();
    userMap.put("Tom", "123");
    userMap.put("Make", "123");
    userMap.put("Lina", "123");
%>
<hr />
HashMap集合中的元素：
<br />
<c:forEach var="entry" items="<%=userMap%>">
    ${entry.key}&nbsp;${entry.value}<br />
</c:forEach>
</body>
</html>
