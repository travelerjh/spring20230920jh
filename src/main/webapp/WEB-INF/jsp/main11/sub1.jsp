<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-25
  Time: 오전 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title> 묵시적  El object</title>
</head>
<body>

    <h1>만들지 않았지만 존재하는 오프젝트</h1>
    <h1> param 을 제일 많이 사용한다.</h1>
<%--    <p> ${pageScope} </p>--%>
<%--    <p> ${header}</p>--%>
    <p>  request parameter  </p>
    <p>  localhost:8080/main11/sub1?name=son&age=30   </p>
    <p>  age=30   --> param 이란 Map 에 넣어둠  </p>
    <p>  name=son   --> param 이란 Map 에 넣어둠  </p>


    <p> ${param.age}</p>
    <p>${param.name}</p>
    <p>${param.email}</p>






</body>
</html>
