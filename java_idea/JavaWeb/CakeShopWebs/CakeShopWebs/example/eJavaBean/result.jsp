<%--
对index.jsp页面中的表单进行处理，实例化User对象，对用户名和密码进行验证，并输出验证结果
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>结果提示</title>
</head>
<body>
<div align="center">
    <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(username,password);
        if (!user.getUsername().equals("")&&!user.getPassword().equals("")){
            out.print("恭喜您，登录成功！");
        } else{
            out.print("请输入正确的用户名和密码！");
        }
    %>
    <br/><br/>
    <a href="index.jsp">返回</a>
</div>
</body>
</html>