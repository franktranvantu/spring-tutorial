<%--
  Created by IntelliJ IDEA.
  User: frank
  Date: 10/14/20
  Time: 7:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<html>
<head>
    <title>Success</title>
    <style>
        h1 {
            text-align: center;
        }
        table {
            margin: auto;
        }
    </style>
</head>
<body>
    <h1>${action} successful!</h1>
    <a href="${contextPath}/create-customer-form">Create Customer</a> | <a href="${contextPath}/get-customers">Show Customers</a>
    <br />
    <br />
    <table>
        <tr>
            <td>Customer ID: </td>
            <td>${customer.customerId}</td>
        </tr>
        <tr>
            <td>First Name: </td>
            <td>${customer.firstName}</td>
        </tr>
        <tr>
            <td>Last Name: </td>
            <td>${customer.lastName}</td>
        </tr>
        <tr>
            <td>Birthdate: </td>
            <td>${customer.birthDate}</td>
        </tr>
        <tr>
            <td>Phone: </td>
            <td>${customer.phone}</td>
        </tr>
        <tr>
            <td>Address: </td>
            <td>${customer.address}</td>
        </tr>
        <tr>
            <td>City: </td>
            <td>${customer.city}</td>
        </tr>
        <tr>
            <td>State: </td>
            <td>${customer.state}</td>
        </tr>
        <tr>
            <td>Points: </td>
            <td>${customer.points}</td>
        </tr>
    </table>
</body>
</html>
