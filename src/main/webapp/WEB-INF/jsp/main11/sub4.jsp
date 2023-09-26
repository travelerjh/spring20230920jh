<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-25
  Time: 오후 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--     요청 파라미터 age--%>
<%--     age 가 20 보타 크거나 같으면      --%>
    <h2> 당신의 나이는  ${param.age} </h2>

<c:if test="${not empty param.age}">
<c:if test="${param.age>19}" var="vote">

    <p> 투표 가능합니다.</p>

</c:if>


<%-- 그렇지 않으면 --%>
    <c:if test="${not vote}" >
    <p> 투표 불가능합니다.</p>

    </c:if>
</c:if>

<c:if test="${empty param.age}">
    <p> 값을 넣어주세요 </p>
</c:if>
</body>
</html>
