<%--
  Created by IntelliJ IDEA.
  User: frank
  Date: 10/13/20
  Time: 10:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form:form action="submit-login" modelAttribute="user">
        Username: <form:input path="username" /> <br />
        Password: <form:input type="password" path="password" /> <br />
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
