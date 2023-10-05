<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-10-05
  Time: 오전 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> 고객  조회 하기 </h1>

<form action="/main19/sub11">
    고객번호
    <input type="text" name="id">
    <button>조회</button>
</form>

<form action="/main19/sub12">
    도시조회
    <input type="text" name="city">
    <button>조회</button>
</form>



</body>
</html>
