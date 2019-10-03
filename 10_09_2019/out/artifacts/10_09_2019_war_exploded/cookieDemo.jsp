<%@ page import="com.jspDemo.CookieUtils" %><%--
  Created by IntelliJ IDEA.
  User: OC
  Date: 9/11/2019
  Time: 8:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cookie Demo</title>
</head>
<body>

<%
    CookieUtils.demoUserCookie(request,response, out);
%>

<a href ="">http://localhost:8080/10_09_2019_war_exploded/cookieDemo.jsp</a>


</body>
</html>