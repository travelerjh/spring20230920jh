<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-25
  Time: 오후 2:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%-- /sub7?show=true--%>
<%-- tbale 데이터출력 --%>

    <c:choose>
            <c:when test="${param.show}">
                       <table>
                        <tr>
                            <td>id</td>
                            <td>firstName</td>
                            <td>lastName</td>
                            <td>className</td>
                            <td>phoneNumber</td>
                        </tr>
                <c:forEach  var="list7" items="${list7}">

                        <tr>
                            <td>${list7.id}</td>
                            <td>${list7.firstName}</td>
                            <td>${list7.lastName}</td>
                            <td>${list7.className}</td>
                            <td>${list7.phoneNumber}</td>
                        </tr>
                </c:forEach>
                       </table>


            </c:when>
            <c:when test="${empty param.show}">
                <p> 데이터가 없습니다. </p>
            </c:when>
    </c:choose>




<%-- sub7/  데이터 가 없다.--%>



</body>
</html>
