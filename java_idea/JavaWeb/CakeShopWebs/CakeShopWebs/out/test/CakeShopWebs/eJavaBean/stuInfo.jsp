<%--
获取JavaBean的属性信息
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息</title>
</head>
<body>
<jsp:useBean id="student" class="cn.itcast.Student"></jsp:useBean>
<jsp:setProperty name="student" property="name" value="小明"></jsp:setProperty>
<jsp:setProperty name="student" property="age" value="18"></jsp:setProperty>
<jsp:setProperty name="student" property="sex" value="男"></jsp:setProperty>
<div>
    <ul>
        <li>
            姓名：<jsp:getProperty name="student" property="name"></jsp:getProperty>
        </li>
        <li>
            年龄：<jsp:getProperty name="student" property="age"></jsp:getProperty>
        </li>
        <li>
            性别：<jsp:getProperty name="student" property="sex"></jsp:getProperty>
        </li>
    </ul>
</div>
</body>
</html>
