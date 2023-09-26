<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-26
  Time: 오전 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/main13/sub2">
    <div>
        <input type="text" name="param1">
    </div>
    <div>
        <input type="password" name="param2">
    </div>
    <div>
        <input type="date" name="param3">
    </div>
    <div>
        <input type="button" name="param4" value="버튼 입니다.">
    </div>
    <div>
        <input type="number" name="param5">
    </div>
    <div>
        <input type="submit" name="param6" value="회원가입">
    </div>
    <div>
        <%--       radio 주파수 하나만 설정 가능  name이 같은  어러개의 선택지중  하나만 선택 가능--%>
        <input type="radio" name="param7">
    </div>
    <div>
        <input type="radio" name="param7">
    </div>
    <div>
        <%--         어러개 선택 가능 --%>
        <input type="checkbox" name="param9">
    </div>
    <div>
        <input type="checkbox" name="param9">
    </div>
    <div>
        <%--    내용은 전송하고 싶은데 숨기고 싶을때 사용한다.--%>
        <input type="hidden" name="param10" value="벨류">
    </div>
    <button>전송</button>
</form>

<form action="/main13/sub2">
    <div>
        <input type="text" required>
    </div>
    <div>
        <input type="text" name="param3" readonly value="son">
    </div>
    <div>
        <input type="text" pattern="\d{3}" name="param5">
    </div>
    <div>
        <input type="checkbox" name="param6">
    </div>
    <div>
        <input type="checkbox" name="param6" checked>
    </div>
    <div>
        <input type="file" multiple>
    </div>

    <button>전송</button>
</form>

<form action="/main13/sub2">
    <%--  있으나 없으나 달라지는 건 없음  --%>
    <div>
        <label for="input1">
            주소
        </label>
        <input type="text" id="input1">
    </div>

        <div>
            <div>
                <label for="check1">Lorem.</label>
                <input type="checkbox" name="" id="check1">
            </div>
            <div>
                <label for="check2">Aut.</label>
                <input type="checkbox" name="" id="check2">
            </div>
            <div>
                <label for="check3">Dolorum!</label>
                <input type="checkbox" name="" id="check3">
            </div>
        </div>

</form>


</body>
</html>
