<%--
  Created by IntelliJ IDEA.
  User: miaoyunlong
  Date: 2024/5/10
  Time: 17:40
  To change this template use File | Settings | File Templates.

  �û���½�ɹ���ʾ����
--%>
<%@ page language="java" pageEncoding="GBK"
         import="cn.itcast.chapter08.model2.domain.UserBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>login successfully</title>
    <style type="text/css">
        #main {
            width: 500px;
            height: auto;
        }
        #main div {
            width: 200px;
            height: auto;
        }
        ul {
            padding-top: 1px;
            padding-left: 1px;
            list-style: none;
        }
    </style>
</head>
<body>
<%
    if (session.getAttribute("userBean") == null) {
%>
<jsp:forward page="register08.jsp" />
<%
        return;
    }
%>
<div id="main">
    <div id="welcome">��ϲ�㣬��¼�ɹ�</div>
    <hr />
    <div>������Ϣ</div>
    <div>
        <ul>
            <li>��������:${userBean.name }</li>
            <li>��������:${userBean.email }</li>
        </ul>
    </div>
</div>
</body>
</html>
