<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-26
  Time: 오후 2:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- action 은 어디로   method 는 어떻게    get  / post 방식  post 안보임 get 은 보임   get이 기본

    get 주소에 쿼리스트링으로 붙어서 전송
        1.브라우저 주소란에 볼 수 있고
        2.길이의 제한이 있다.

   post방식  : 요청 본문에 붙어서 전송
              1. 브라우저에서 볼수 없음
              2. 길이의 제한이 없다.
              3. 파일전송은 포스트방식



--%>
<h2>  포스트 방식 </h2>
<form action="/main14/sub2" method="post"   >
    <div>
        id:
        <input type="text" name="id">
    </div>

    <div>
        pw:
        <input type="password" name="password">
    </div>
    <button>전송</button>
</form>


<h2>  겟 방식 </h2>
<form action="/main14/sub2" method="get"   >
    <div>
        id:
        <input type="text" name="id">
    </div>

    <div>
        pw:
        <input type="password" name="password">
    </div>
    <button>전송</button>
</form>

</body>
</html>
