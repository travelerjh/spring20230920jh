<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-10-08
  Time: 오후 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1> 커스터머 아이디 검색 결과</h1>
    <table>
            <tr>
                <th>CustomerId</th>
                <th>CustomerName</th>
                <th>Address</th>
                <th>City</th>
                <th>Country</th>
            </tr>
            <c:forEach var="list" items="${list}">
               <tr>
                   <td>${list.id}</td>
                   <td>${list.name}</td>
                   <td>${list.address}</td>
                   <td>${list.city}</td>
                   <td>${list.country}</td>
               </tr>
            </c:forEach>
    </table>



</body>
</html>
