<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-22
  Time: 오후 2:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<style>
    *{
        text-decoration: none;
        list-style: none;
    }

</style>
<c:forEach begin="0" end="3"   var="i">
    <p> cake :  ${foodlist[i]}</p>
</c:forEach>


<c:forEach items="${names}" var="items">
        <p> ${items}</p>
</c:forEach>


<%-- varStatus : 반복문의 상태 --%>
<c:forEach begin="0"  end="3"   var="n"  varStatus="s">
    <p> ${n} ${s}</p>

</c:forEach>


<ul>
    <c:forEach items="${foodlist}" var="food" varStatus="s">
        <li>
               ${s.count} : ${food}
        </li>

    </c:forEach>

</ul>



</body>
</html>
