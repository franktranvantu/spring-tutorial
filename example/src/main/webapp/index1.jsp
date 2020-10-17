<%--
  Created by IntelliJ IDEA.
  User: frank
  Date: 10/13/20
  Time: 8:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form action="hello">
        UserName : <form:input type="text" path="user"/> <br><br>
        Password : <form:input type="text" path="pass"/> <br><br>
        <form:input type="submit" path="" />
    </form:form>
</body>
</html>
