<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-27
  Time: 오전 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    session 말고 왜 model이 우선순위냐 하면  세션이 넓은 영역이고 모델이 좁은 영역이라  좁은 영역에서 사용한다.

         우선순위
        page  >  model(request) > session > application

                명시해서 찾는거 ssessionScope . attr
      --%>
    <h1>
        ${model}  ${set}     ${att}
<%--        돈까스 윈  모호한 상황 안나오게 한다. --%>
    </h1>

<h1>   el에서 만들어진게 있어</h1>
<%--  sessionScope 이미 가지고 있다 .--%>
<h1>   ${sessionScope.att} </h1>


</body>
</html>
