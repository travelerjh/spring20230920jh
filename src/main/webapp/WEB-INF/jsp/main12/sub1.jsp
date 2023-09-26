<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-25
  Time: 오후 2:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    name  이 쿼리로 받는다.   --%>
        <h1> form  요소 </h1>
        <form action="">
            <input type="text" name="param1">
            <br>
            <input type="text" name="param2" >

            <button>전송</button>
        </form>

<form action="">
    <input type="text"name="name">
    <input type="text"name="age">
    <input type="text"name="address">
    <input type="text"name="email">
    <input type="submit"></input>
</form>

<h3>  연슨문제7 </h3>

<%-- 어디로 보내주는 지  action 이 하는 일!!! --%>
<%-- request 파라미터를 어디로 보낼지 결정 --%>

<%--구글--%>
<form action="https://www.google.com/search?">
    <input type="text" name="q">
    <input type="submit">
</form>
<%--다음--%>
<form action="https://search.daum.net/search">
    <input type="text" name="q"ss   >
    <input type="submit">
</form>

<%--    / 로 시작하는 경우 path 경로가 결정됨--%>
<form action="/main12/sub2">
    <input type="text" name="age">
    <button> 전송 </button>
</form>


<h2> 페스에서  마지막 슬레쉬 기준 </h2>
<form action="">
    <input type="text" name="email" id="">
    <button> 전송</button>
</form>










</body>
</html>
