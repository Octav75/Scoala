<%--
  Created by IntelliJ IDEA.
  User: OC
  Date: 9/10/2019
  Time: 9:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    public int sum(int a, int b) {
        return a + b;
    }
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Method in JSP</title>
</head>
<body>

<h1>
    1 + 2 =    <%=sum(1, 2)%>
</h1>

</body>
</html>