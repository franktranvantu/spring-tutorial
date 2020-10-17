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
    <title>Delete Customer</title>
    <style>
        h1, p {
            text-align: center;
        }
        table {
            margin: auto;
        }
        .buttons {
            text-align: right;
        }
        p {
            color: red;
            font-size: 20px;
        }
    </style>
</head>
<body>
    <h1>Delete Customer</h1>
    <p>Are you sure that you want to permanently delete the customer?</p>
    <form:form action="${contextPath}/delete-customer/${customer.customerId}" modelAttribute="customer">
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
            <tr class="buttons">
                <td><input type="submit" name="action" value="Cancel" /></td>
                <td><input type="submit" name="action" value="Delete" /></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
