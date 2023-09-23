<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-22
  Time: 오후 2:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>
        forEach tag
    </h1>
    <p>컨턴츠 반복 출력</p>
    <p>주요 attribute : begin,end, var, items ,vatStatus</p>
<%--   begin 과 end 포함 해서 반복   --%>
    <c:forEach begin="1" end="3">
        <li>Lorem ipsum.</li>
    </c:forEach>

    <hr>
<%-- var는  담기는 숫자 --%>
<c:forEach begin="0" end="2" var="ppp">
    <li>ppp : ${ppp }</li>
</c:forEach>


<c:forEach begin="0"   end="2"  var="num">
        <li> car : ${list[num]} </li>
</c:forEach>

<%--    item -->  반복할 리스트   --%>
<c:forEach items="${list}"  var="car" >
    <li> car : ${car}</li>
</c:forEach>


<c:forEach begin="0" end="3"   var="i">
    <p> cake :  ${foodlist[i]}</p>
</c:forEach>

</body>
</html>
