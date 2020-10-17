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
    <title>All Customers</title>
    <style>
        table {
            border-collapse: collapse;
            margin: auto;
        }
        table, th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <h1>All Customers</h1>
    <a href="${contextPath}/create-customer-form">Create Customer</a>
    <br />
    <br />
    <table>
        <tr>
            <th>Customer ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Birthdate</th>
            <th>Phone</th>
            <th>Address</th>
            <th>City</th>
            <th>State</th>
            <th>Points</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="customer" items="${customers}">
            <tr>
                <td>${customer.customerId}</td>
                <td>${customer.firstName}</td>
                <td>${customer.lastName}</td>
                <td>${customer.birthDate}</td>
                <td>${customer.phone}</td>
                <td>${customer.address}</td>
                <td>${customer.city}</td>
                <td>${customer.state}</td>
                <td>${customer.points}</td>
                <td><a href="${contextPath}/update-customer-form/${customer.customerId}">Update</a> | <a href="${contextPath}/delete-customer-confirm/${customer.customerId}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
