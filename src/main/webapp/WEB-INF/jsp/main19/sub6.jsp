<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-04
  Time: 오후 4:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            border: 1px solid black;
        }

        th {
            background-color: aqua;
        }

    </style>
</head>
<body>
<h4>고객 목록</h4>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>address</th>
        <th>country</th>
    </tr>
    <c:forEach items="${list}" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.address}</td>
            <td>${list.country}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
