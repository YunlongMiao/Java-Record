<%--
  Created by IntelliJ IDEA.
  User: miaoyunlong
  Date: 2024/5/11
  Time: 23:44
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<style>
    * {
        margin: 0;
        padding: 0;
    }
    form {
        display: block;
        height: auto;
        width: 450px;
        margin: 100px auto;
    }
    form table tr {
        height: 40px;
    }
    form table tr td {
        height: 40px;
        width: 280px;
        line-height: 40px;
    }
    form table tr td input {
        height: 32px;
        border: 1px solid #BABABA;
        border-radius: 6px;
    }
    .alignRight {
        text-align: right;
        line-height: 40px;
        font-size: 16px;
        font-family: "Monaco";
        width: 200px;
    }
    .submit {
        display: block;
        height: 40px;
        width: 250px;
        color: white;
        font-weight: bold;
        font-size: 18px;
        background-color: #98ECAC;
        border-radius: 8px;
        margin: 15px auto;
    }
</style>
<body>
<form action="LoginServlet10" method="post">
    <table>
        <tr>
            <td class="alignRight">
                Username:
            </td>
            <td>
                <input type="text" name="username" />
            </td>
        </tr>
        <tr>
            <td class="alignRight">
                Password:
            </td>
            <td>
                <input type="password" name="password" />
            </td>
        </tr>
    </table>
    <input type="submit" value="登 录" class="submit" />
</form>
</body>
</html>

