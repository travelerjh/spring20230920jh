<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-22
  Time: 오후 2:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--   jtsl 사용하는 코드  --%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>${p1.id}</h3>
    <h3>${p1.name}</h3>
    <h3>${p1.foods[0]}</h3>
    <h3>${p1.foods[1]}</h3>
    <h3>${p1.foods[2]}</h3>


    <h3>${p1.cars[0]}</h3>
    <h3>${p1.cars[1]}</h3>
    <h3>${p1.cars[2]}</h3>

<%--    jstl --%>
<%-- food ,car 를 이용해서 jstl 사용예정--%>


    <c:forEach items="${p1.cars}" var="car">
            <h3>${cars}</h3>
    </c:forEach>


<c:forEach var="foods" items="${p1.foods}">
        <h3> </h3>
</c:forEach>



</body>
</html>
