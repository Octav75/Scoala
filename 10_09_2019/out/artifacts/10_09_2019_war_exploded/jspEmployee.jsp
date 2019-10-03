<%--
  Created by IntelliJ IDEA.
  User: OC
  Date: 9/11/2019
  Time: 7:18 PM
  To change this template use File | Settings | File Templates.
--%>
<?xml version="1.0" ?>
<%@ page pageEncoding="UTF-8"%>

<data>

    <h3>Please view source of this page</h3>

    <%--  Create Employee and set value for its fields --%>

    <jsp:useBean id="emp"
                 class="com.jspDemo.Employee">

        <jsp:setProperty name="emp" property="empNo" value="E01" />
        <jsp:setProperty name="emp" property="empName" value="Smith" />

    </jsp:useBean>

    <employee empNo="<%=emp.getEmpNo()%>">
        <%=emp.getEmpName()%>
    </employee>

</data>