<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-10-04
  Time: 오후 5:26
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
                    <th>SupplierName</th>
                    <th>SupplierID </th>
                    <th>Address </th>
                    <th> City</th>
                    <th>PostalCode</th>
                    <th>Country</th>
                    <th>Phone</th>
                </tr>
            <c:forEach var="list"   items="${list}">
                <tr>
                    <td>${list.name}</td>
                    <td>${list.id}</td>
                    <td>${list.address}</td>
                    <td>${list.city}</td>
                    <td>${list.postalcode}</td>
                    <td>${list.country}</td>
                    <td>${list.phone}</td>

                </tr>
            </c:forEach>

        </table>



</body>
</html>
