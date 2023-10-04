<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-27
  Time: 오전 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>좋아하는 음식 고르세요</title>
</head>
<body>
<h1>좋아하는 음식 고르세요</h1>
<form action="/main15/sub8" method="post">
    <div>
        <label for="in1">pizza</label>
        <input type="checkbox" name="food" id="in1" value="pizza">
    </div>
    <div>
        <label for="in2">donut</label>
        <input type="checkbox" name="food" id="in2" value="donut">
    </div>
    <div>
        <label for="in3">tan</label>
        <input type="checkbox" name="food" id="in3" value="tan">
    </div>
    <div>
        <label for="in4">kimbab</label>
        <input type="checkbox" name="food" id="in4" value="kimbab">
    </div>
    <div>
        <label for="in5">bibimbab</label>
        <input type="checkbox" name="food" id="in5" value="bibimbab">
    </div>

    <button>전송</button>

</form>

<br>

<a href="/main15/sub8">sub8</a>
<a href="/main15/sub9">sub9</a>

</body>
</html>
