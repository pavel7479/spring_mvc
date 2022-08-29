<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>
<h2>Dear Employee, your are Welcome!!!</h2>
<br>
<br>
<br>

Your name: ${employee.name}
<br>
<br>
Your surname: ${employee.surname}
<br>
<br>
Your salary: ${employee.salary}
<br>
<br>
Your department: ${employee.department}
<br>
<br>
Your phone number: ${employee.phoneNumber}
<br>
<br>
Your car: ${employee.carBrend}
<br>
<br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.lenguges}">
        <li> ${lang}  </li>

        </c:forEach>
</ul>
<br>
<br>
Your email: ${employee.email}
</body>
</html>
