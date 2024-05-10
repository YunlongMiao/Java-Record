<%--
JSP页面---向客户端发送文本内容
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" buffer="0kb" %>      <%-- buffer="0kb"   设置缓冲区大小--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" buffer="0kb" %>--%>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
<%
    out.println("first line<br />");                    <%--jsp界面结束写入缓冲区--%>
    response.getWriter().println("second line<br />");  <%--直接写入缓冲区--%>
%>
</body>
</html>
