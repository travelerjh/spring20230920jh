<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-10-04
  Time: 오후 3:18
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
                <th>costomerId</th>
            <th>customerName</th>
            <th>city</th>
            <th>country</th>
        </tr>
        <c:forEach var="list" items="${list}" >
        <tr>

                    <td> ${list.id}</td>
                    <td> ${list.name}</td>
                    <td> ${list.city}</td>
                    <td> ${list.country}</td>
            </c:forEach>
        </tr>





    </table>




</body>
</html>
