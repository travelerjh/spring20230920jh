<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-10-10
  Time: 오후 3:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> 공급자 입력</h3>
<form action="/main24/sub2" method="post">
    <div>
        공급자 이름
        <input type="text" name="SupplierName">
    </div>
    <div>
        이름
        <input type="text" name="ContactName">
    </div>
    <div>
        주소
        <input type="text" name="Address">
    </div>
    <div>
        도시
        <input type="text" name="City">
    </div>
    <div>
        우편번호
        <input type="text" name="PostalCode">
    </div>
    <div>
        나라
        <input type="text" name="Country">
    </div>
    <div>
        번호
        <input type="text" name="Phone">
    </div>
    <div>
        <input type="submit" value="등록">
    </div>
</form>


</body>
</html>
