<%--
  Created by IntelliJ IDEA.
  User: frank
  Date: 10/13/20
  Time: 8:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form action="register" modelAttribute="user">
        <form:input path="username" />
        <form:input path="password" />
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
