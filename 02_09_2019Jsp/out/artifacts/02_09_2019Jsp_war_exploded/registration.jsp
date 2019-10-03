<%--
  Created by IntelliJ IDEA.
  User: OC
  Date: 9/2/2019
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body bgcolor="#696969">
<STRONG>Registration Form</STRONG>

<%
    if (null != request.getSession().getAttribute("error")) {
        out.println(request.getSession().getAttribute("error"));
        request.getSession().setAttribute("error", null);
    }
%>

<form action="registration" method="post">
    <%-- // post face o insregistrare pe server (nu are limite) = CTRL + SHIFT + / --%>
    <table bgcolor="#90ee90" style="with: 50%">
        <tr>
            <td>First Name</td>
            <td><input type="text" name="first_name"/></td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><input type="text" name="last_name"/></td>
        </tr>
        <tr>
            <td>UserName</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><input type="text" required name="address"/></td>
        </tr>
        <tr>
            <td>Contact No</td>
            <td><input type="text" name="contact"/></td>
        </tr>
    </table>
    <input type="submit" value="Submit"/></form>

</body>
</html>
