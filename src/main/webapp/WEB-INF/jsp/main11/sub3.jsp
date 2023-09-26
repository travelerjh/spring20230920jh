<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-25
  Time: 오전 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>출력 가능 </h2>
        <c:if test="true" >
            <p> 출력 </p>
        </c:if>

    <h2>출력 불가능 </h2>
        <c:if test="false" >
            <p> 출력안됨 </p>
        </c:if>


    <h3> 띄어쓰기 주의 </h3>
    <c:if test="${param.name  == 'son'}">
        <p>  hello son </p>
    </c:if>


    <h3>   띄어쓰기 주의 </h3>
    <c:if test="${param.name  == 'son'}" var="isSon">
        <p> 여전히 손 </p>
    </c:if>
    <c:if test="${not isSon}">
        <p> son 아님 </p>
    </c:if>



</body>
</html>
