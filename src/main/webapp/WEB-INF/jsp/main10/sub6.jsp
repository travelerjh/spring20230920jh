<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-22
  Time: 오후 3:45
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
                <c:forEach items="${list.id[0]}" var="list">
                <td>   ${list} </td>
                </c:forEach>
<%--                <c:forEach items="${list.firstname[0]}" var="list">--%>
<%--                    <td>   ${list} </td>--%>
<%--                </c:forEach>  ds--%>

            </tr>

    </table>


</body>
</html>
