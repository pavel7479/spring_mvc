<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 22.08.2022
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>
<h2>Dear Employee, please enter your details</h2>
<br>
<br>
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    <br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    <br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
    </form:select>
    <br>
    <br>
    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    <br>
<%--    BMW <form:radiobutton path="carBrend" value="BMW"/>--%>
<%--    Audi <form:radiobutton path="carBrend" value="Audi"/>--%>
<%--    MB <form:radiobutton path="carBrend" value="Mersedes-Benz"/>--%>
    <form:radiobuttons path="carBrend" items="${employee.carBrends}"/>
    <br>
    <br>
<%--    EN <form:checkbox path="lenguges" value="English"/>--%>
<%--    FR <form:checkbox path="lenguges" value="French"/>--%>
<%--    DE <form:checkbox path="lenguges" value="Deutch"/>--%>
    <form:checkboxes path="lenguges" items="${employee.lengugeList}"/>
    <br>
    <br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    <br>
    <input type="submit" value="OK"/>
</form:form>
</body>
</html>
