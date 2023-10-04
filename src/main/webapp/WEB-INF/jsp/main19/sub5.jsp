<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-10-04
  Time: 오후 3:40
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
                <th>ProductID</th>
                <th>ProductName</th>
                <th>Unit</th>
                <th>Price</th>
            </tr>
        <c:forEach items="${list}" var="list">
            <tr>
               <td>${list.ProductID}</td>
               <td>${list.ProductName}</td>
               <td>${list.Unit}</td>
               <td>${list.Price}</td>
            </tr>
        </c:forEach>

    </table>



</body>
</html>
