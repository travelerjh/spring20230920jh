<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-22
  Time: 오전 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>



        <h1>  ${map22} </h1>
        <h1>  ${map22["son"]} </h1>
        <h1>  ${map22["lee"]} </h1>
        <h1>  ${map22["kim"]} </h1>
<%--밑에꺼 선호 한다 대중은--%>
        <h3>${map22.son}</h3>
        <h3>${map22.lee}</h3>
        <h3>${map22.kim}</h3>


        <h2>${cityMap.seoul}</h2>
        <h2>${cityMap.busan}</h2>
        <h2>${color.red}</h2>
        <h2>${color.blue}</h2>
        <h2>${color["black"]}</h2>


</body>
</html>
