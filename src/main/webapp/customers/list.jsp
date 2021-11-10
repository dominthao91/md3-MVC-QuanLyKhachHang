<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/10/2021
  Time: 9:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Custmer List</title>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="/customer?action=create">Creat new Customer</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["customers"]}' var="cus">
<tr>
    <td><a href="/customers?action=view&id=${cus.getId()}">${cus.getName()}</a></td>
    <td>${cus.getEmail()}</td>
    <td>${cus.getAddress()}</td>
    <td><a href="/customers?action=edit&id=${customer.getId()}">edit</a></td>
    <td><a href="/customers?action=delete&id=${customer.getId()}">delete</a></td>
</tr>
    </c:forEach>
</table>
</body>
</html>
