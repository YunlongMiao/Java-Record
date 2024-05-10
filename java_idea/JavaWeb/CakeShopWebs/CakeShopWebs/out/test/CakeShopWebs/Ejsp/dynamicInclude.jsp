<%--
JSP页面---包含included.jsp，引入暂停5s
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dynamicInclude page</title>
</head>
<body>
dynamicInclude.jsp内的中文
<br />
<jsp:include page="included.jsp" flush="true" />
</body>
</html>
