<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-26
  Time: 오후 3:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title></title>
</head>
<body>

<form action="/main14/sub4" method="post">
    <label for="t">좋아하는 인물</label>
    <input type="text" name="title" id="t">
    <label for="s">어떤인물을 좋아하나요? </label>
    <textarea name="content" id="s" cols="30" rows="10">
        내용을 입력하세요
    </textarea>
    <button>보내</button>
</form>

</body>
</html>
