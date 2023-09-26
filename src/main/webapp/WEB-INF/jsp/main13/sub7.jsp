<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-26
  Time: 오후 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/main13/sub8">
    <div>
        <label for="0">아이디</label>
        <input type="text" name="id" id="0">
    </div>
    <div>
        <label for="1">이름</label>
        <input type="text" name="name" id="1">
    </div>
    <div>
        <label for="2"> 주소 </label>
        <input type="text" name="address" id="2">
    </div>
    <div>
        <label for="3">스케줄</label>
        <input type="date" name="schedule" id="3">
    </div>
    <div>
        <label for="4">농구</label>
        <input type="checkbox"  value="농구"name="todos" id="4">
    </div>
    <div>
        <label for="5">축구</label>
        <input type="checkbox" value="축구" name="todos" id="5">
    </div>
    <div>
        <label for="6">야구</label>
        <input type="checkbox" value="야구" name="todos" id="6">
    </div>

    <button>전송</button>
</form>


</body>
</html>
