<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ivan
  Date: 01.07.2022
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h2>Employee Info</h2>
  <form:form action="saveEmployee" modelAttribute="employee">
      Name <form:input path="name"/> <br>
      Surname <form:input path="surname"/> <br>
      Department <form:input path="department"/> <br>
      Salary <form:input path="salary"/> <br>
      <input type="submit" value="ok">
  </form:form>
</body>
</html>
