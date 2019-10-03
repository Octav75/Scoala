<%--
  Created by IntelliJ IDEA.
  User: OC
  Date: 9/11/2019
  Time: 6:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Use Bean</title>
</head>
<body>

<jsp:useBean id="helloBean"
             class="com.jspDemo.HelloBean"></jsp:useBean>


<h3>Say Hello:</h3>
<jsp:getProperty name="helloBean" property="hello" />

<!-- Set property name for helloBean -->
<jsp:setProperty  name="helloBean" property="name" value="JSP"/>
<h3>Say Hello after setName</h3>
<jsp:getProperty name="helloBean" property="hello" />


</body>
</html>