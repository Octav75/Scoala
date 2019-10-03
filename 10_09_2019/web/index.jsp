<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: OC
  Date: 9/10/2019
  Time: 8:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<h1>Hello JSP</h1>

<%
    java.util.Date date = new java.util.Date();
%>

<h2>
    Now is
    <%=date.toString()%>
</h2>

<%
    // Using out variable:
    out.println("<h1>Now is "+ new Date()+"</h1>");

// Using request variable:
    String serverName= request.getServerName();


//// Using response variable:
//    response.sendRedirect("http://eclipse.org");

%>

</body>
</html>
