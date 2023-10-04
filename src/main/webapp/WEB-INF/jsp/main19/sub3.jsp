<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-10-04
  Time: 오후 2:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Phone</th>
        </tr>
        <c:forEach items="${suppliers} var="supplier">
        <tr>
        <td>${supplier.id}</td>
        <td>${supplier.name}</td><td></td>
        <td>${supplier.phone}</td><td></td>

        </tr>

        </c:forEach>
    </table>




</body>
</html>
