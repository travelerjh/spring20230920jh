<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-10-05
  Time: 오후 5:30
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
            <th> cutomerId</th>
            <th> cutomerName</th>
            <th> ContactName</th>
            <th> Address</th>
        </tr>
        <c:forEach  var="countryList" items="${countryList}">
            <tr>
                <td>${countryList.cutomerId}</td>
                <td>${countryList.cutomerName}</td>
                <td>${countryList.ContactName}</td>
                <td>${countryList.Address}</td>
            </tr>
        </c:forEach>


    </table>



</body>
</html>
