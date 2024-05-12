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
  <title>index</title>
  <script type="text/javascript"
          src="${pageContext.request.contextPath}/jquery-3.6.0.js"></script>
  <script language="JavaScript">
    function getInfo() {
      $.get("http://localhost:8080/CakeShopWebs/getInfo12.jsp?nocache="+new  Date().getTime(),function (data) {
        $("#showInfo").html(data);
      });
    }
    $(document).ready(function () {
      getInfo();//调用getInfo()方法获取公告信息
      window.setInterval("getInfo()",600000);
    })
  </script>
</head>

<body>
<section>
  <marquee id="showInfo" direction="up" scrollamount="3">
  </marquee>
</section>

<br />
<center>
  <h3>欢迎光临</h3>
</center>
<br />
<br />
<c:choose>
  <c:when test="${sessionScope.user==null }">
    <a href="${pageContext.request.contextPath }/login09.jsp">第九章用户登录</a>
  </c:when>
  <c:otherwise>
    欢迎你，${sessionScope.user.username }!
    <a href="${pageContext.request.contextPath }/LogoutServlet09">第九章注销</a>
  </c:otherwise>
</c:choose>
<hr />
</body>
</html>