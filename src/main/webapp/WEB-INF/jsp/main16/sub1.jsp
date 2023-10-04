<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-27
  Time: 오전 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1> model 꺼내기</h1>
<h1>${model}</h1>
<h1>session 꺼내기</h1>
<h1>${sessionScope.session}</h1>
<h1>application 꺼내기</h1>
<h1>${applicationScope.application}</h1>


<h1> model 꺼내기</h1>
<h1>${m}</h1>
<h1>session 꺼내기</h1>
<h1>${sessionScope.m}</h1>
<h1>application 꺼내기</h1>
<h1>${applicationScope.m}</h1>





</body>
</html>
