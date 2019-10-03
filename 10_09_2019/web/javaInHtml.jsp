<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: OC
  Date: 9/10/2019
  Time: 8:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Java In HTML</title>
</head>
<body>

<%
    Random random = new Random();

    // Returns a random number (0, 1 or 2)
    int randomInt = random.nextInt(3);


    if (randomInt == 0) {
%>

<h1>Random value =<%=randomInt%></h1>

<%
} else if (randomInt == 1) {
%>

<h2>Random value =<%=randomInt%></h2>

<%
} else {
%>
<h3>Random value =<%=randomInt%></h3>
<%
    }
%>

<a href="<%= request.getRequestURI() %>">Try Again</a>

</body>
</html>
