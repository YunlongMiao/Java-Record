<%--
  Created by IntelliJ IDEA.
  User: miaoyunlong
  Date: 2024/5/12
  Time: 21:40
  To change this template use File | Settings | File Templates.
  从数据库查询数据
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@page import="java.sql.*" %>
<jsp:useBean id="conn" class="cn.itcast.chapter12.ConnDB"
             scope="page"></jsp:useBean>
<ul>
    <%
        ResultSet rs=conn.executeQuery("select title from info order by id desc");
        if(rs.next()){
            do{
                out.print("<li>"+rs.getString(1)+"</li>");
            }while (rs.next());
        }else{
            out.print("<li>暂无公告信息！</li>");
        }
    %>
</ul>
