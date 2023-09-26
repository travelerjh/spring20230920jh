<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-25
  Time: 오전 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h5> 산술 연산자  </h5>
    <p>${a}+${b} = ${a+b}</p>
    <p>${a}-${b} = ${a-b}</p>
    <p>${a}*${b} = ${a*b}</p>
<%--    나누기는  소수점까지  나옴--%>
    <p>${a}/${b} = ${a/b}</p>


    <h4> 구구단 출력</h4>
    <c:forEach var="i" begin="1" end="9">
        <p> 2*${i}  =${i*2}</p>
    </c:forEach>

<h4> 구구단 2~9 출력</h4>
    <c:forEach begin="2" var="i" end="9">
        <c:forEach begin="1"    var="x" end="9">
           <p> ${x}*${i}= ${x*i};</p>
        </c:forEach>
    </c:forEach>

<h4>   구구단 9단에서 2단출력 </h4>
        <c:forEach var="w"  begin="1" end="9">
         <c:forEach  var="q" begin="1" end="9">
            <p>${10-q}*${w} =${(10-q)*w};</p>
         </c:forEach>
        </c:forEach>

<h4> 나머지 연산  (modulo, remainder) 나머지 값 구하기  </h4>
    <p>${b}%${a} =${b%a}</p>


</body>
</html>
