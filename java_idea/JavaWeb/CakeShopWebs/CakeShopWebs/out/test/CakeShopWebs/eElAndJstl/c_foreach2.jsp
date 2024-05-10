<%--
JSP页面---使用了＜eforEach＞标签的 begin、end和step属性

在文件c＿foreach1的JSP文件中，已经使用＜c：forEach＞标签做到了循环数组或集合，在部分情况下需要指定＜c：forEach＞标签循环的次数、起始索引和结束索引。
在JSTL的Core标签库中，＜c：forEach＞标签的begin、end和step属 性分别用于指定循环的起始索引、结束索引和步长。
使用这些属性可以迭代集合对象中某一范围内的元素。
--%>


<%@ page language="java" contentType="text/html; charset=utf-8"
         import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head></head>
<body>
colorsList集合（指定迭代范围和步长）<br />
<%
    List colorsList=new ArrayList();
    colorsList.add("red");
    colorsList.add("yellow");
    colorsList.add("blue");
    colorsList.add("green");
    colorsList.add("black");
%>
<c:forEach var="color" items="<%=colorsList%>" begin="1"
           end="3" step="2">
    ${color}&nbsp;
</c:forEach>
</body>
</html>
