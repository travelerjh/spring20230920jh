<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-25
  Time: 오전 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
          sub2/dan= 2
           구구단 2단이 출력도록
           dan=3
           sub2/구구단 3단이 출력되도록

           단이 2~9 사이여야함
--%>

<h2>        ${param.dan}; </h2>

    <c:if test="${(param.dan>1) and (param.dan<10)}" var="dan">
    <c:forEach var="i"  begin="1" end="9">
   <p>     ${param.dan} *${i} =  ${param.dan * i}</p>

    </c:forEach>
    </c:if>
    <c:if test="${not dan}">
        <p>"2~9의 값을 넣으세요 "</p>
    </c:if>




</body>
</html>
