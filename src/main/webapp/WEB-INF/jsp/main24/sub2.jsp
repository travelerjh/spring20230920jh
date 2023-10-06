<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-10-10
  Time: 오후 2:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2> 어떤게 들어갔나 보자</h2>

    <table>
        <tr>
            <th>SupplierId</th>
            <th>SupplierName</th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
        </tr>
    <c:forEach var="list"  items="${list}">
            <tr>
                <td>${list.supplierName}</td>
            </tr>
    </c:forEach>



    </table>



</body>
</html>
