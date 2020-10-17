<%--
  Created by IntelliJ IDEA.
  User: frank
  Date: 10/13/20
  Time: 11:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<html>
<head>
    <title>Update Customer</title>
    <style>
        h1 {
            text-align: center;
        }
        table {
            margin: auto;
        }
        .buttons {
            text-align: right;
        }
    </style>
</head>
<body>
    <h1>Update Customer</h1>
    <form:form action="${contextPath}/update-customer/${customer.customerId}" modelAttribute="customer">
        <table>
            <tr>
                <td>First Name: </td>
                <td><form:input path="firstName" /></td>
            </tr>
            <tr>
                <td>Last Name: </td>
                <td><form:input path="lastName" /></td>
            </tr>
            <tr>
                <td>Birthdate: </td>
                <td><form:input type="date" path="birthDate" /></td>
            </tr>
            <tr>
                <td>Phone: </td>
                <td><form:input path="phone" /></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><form:input path="address" /></td>
            </tr>
            <tr>
                <td>City: </td>
                <td><form:input path="city" /></td>
            </tr>
            <tr>
                <td>State: </td>
                <td><form:input path="state" /></td>
            </tr>
            <tr>
                <td>Points: </td>
                <td><form:input type="number" path="points" /></td>
            </tr>
            <tr class="buttons">
                <td></td>
                <td><input type="submit" value="Save" /></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
