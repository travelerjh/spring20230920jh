<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-10-10
  Time: 오전 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h2> 고객명 검색</h2>

    <form action="">
        <input type="text" name="k" >
        <button>검색</button>
    </form>

    <ul>
        <c:forEach items="${list}" var="name">
            <li>${name}</li>
        </c:forEach>

    </ul>



</body>
</html>
