<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-10-10
  Time: 오후 3:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>새 직원 등록</h3>
<form action="/main24/sub5" method="get">
    <%--div*6>input[name]--%>
    <div>
        <input type="text" name="LastName" value="두식">
    </div>
    <div>
        <input type="text" name="FirstName" value="김">
    </div>
    <div>
        <input type="date" name="BirthDate" value="2002-02-02">
    </div>
    <div>
        <input type="text" name="Photo" value="사진">
    </div>
    <div>
        <textarea name="Notes" id="" cols="30" rows="10"></textarea>
    </div>
    <div>
        <input type="submit" value="등록">
    </div>
</form>
</body>
</html>
