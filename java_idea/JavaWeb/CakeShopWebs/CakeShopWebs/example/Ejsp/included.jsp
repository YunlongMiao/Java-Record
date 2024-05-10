<%--
JSP页面---被dynamicInclude.jsp包含文件，暂停5s
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>include</title>
</head>
<body>
<%Thread.sleep(5000);%>
included.jsp内的中文<br />
</body>
</html>
