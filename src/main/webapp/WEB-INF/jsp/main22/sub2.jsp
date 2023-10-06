<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-10-06
  Time: 오전 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div>
    <c:forEach begin="1" end="${lastPageNumber}" var="p">
        <a href="/main22/sub2?p=${p}">${p}</a>
        |
    </c:forEach>

</div>


    <table>
        <tr>
            <th> SupplierID</th>
            <th> SupplierName</th>
            <th> Address</th>
            <th> Country</th>
        </tr>
        <c:forEach items="${list}" var="list">
            <tr>
                <td>${list.SupplierID}</td>
                <td>${list.SupplierName}</td>
                <td>${list.Address}</td>
                <td>${list.Country}</td>
            </tr>

        </c:forEach>
    </table>




</body>
</html>
