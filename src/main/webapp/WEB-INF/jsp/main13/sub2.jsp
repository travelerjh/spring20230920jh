<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-26
  Time: 오전 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/main13/sub3">
    <div>
        <label for="input1">Lorem.</label>
        <input type="text" name="param1"  id="input1">
    </div>
    <div>
        <label for="input2">Molestias?</label>
        <input type="number" name="param2" id="input2">
    </div>
    <div>
<%--         암호 노출 안되는 법 이따 알수 있다.--%>
        <label for="input3">Ipsa!</label>
        <input type="password" name="param3" id="input3">
    </div>
    <div>
        <label for="input4">Quia.</label>
        <input type="date" name="param4" id="input4">
    </div>
    <div>
        <label for="input5">Aliquid.</label>
        <input type="datetime-local" name="param5" id="input5">
    </div>
<%--     라디오는 둘중에 하나만 선택    [   +    ] 띄어쓰기   --%>
    <div>
        <label for="input6">Assumenda.</label>
        <input type="radio" name="param6" value="radio value1" id="input6">
    </div>
    <div>
        <label for="input7">Molestias.</label>
        <input type="radio" name="param6" value="radio value2" id="input7">
    </div>
    <div>
        <label for="input8">Enim!</label>
        <input type="checkbox" name="param8" id="input8">
    </div>
    <div>
        <label for="input9">Iure?</label>
        <input type="checkbox" name="param8" id="input9">
    </div>
    <div>
        <label for="input10">Nesciunt!</label>
        <input type="checkbox" name="param8" id="input10">
    </div>


    <button>전송</button>
</form>

</body>
</html>
