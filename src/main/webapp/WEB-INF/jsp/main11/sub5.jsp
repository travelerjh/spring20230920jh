<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-25
  Time: 오후 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
      <h1>jstl, choose ,when, otherwise, tag </h1>
<%--    choose 에 처음만나는 when 이 출력된다.   --%>
    <c:choose>
        <c:when test="ture">
            <p> when 1번</p>
        </c:when>
        <c:when test="ture">
            <p> when 2번</p>
        </c:when>
        <c:when test="ture">
            <p> when 3번</p>
        </c:when>
    </c:choose>

      <%--    choose 안에 값이 모두 false 이면 otherwise를 사용한다.   --%>
      <c:choose>
          <c:when test="false">
              <p> when 1번</p>
          </c:when>
          <c:when test="false">
              <p> when 2번</p>
          </c:when>
          <c:when test="false">
              <p> when 3번</p>
          </c:when>
          <c:otherwise>
              <p> otherwise 가 출력된다. </p>
          </c:otherwise>
      </c:choose>


</body>
</html>
