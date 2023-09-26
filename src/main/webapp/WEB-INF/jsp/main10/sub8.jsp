<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-09-25
  Time: 오전 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> 비교 연산자  boolean 참 거짓으로 판명된다. </h3>
<h3> 비교 연산자는  숫자가 아니라 문자도 가능하다 . </h3>

<p>     <,>, <=,>=, == ,!-     </p>
    <p>   ${a} <${b}  = ${a<b} </p>
    <p>   ${a} <${b}  = ${a lt b} </p>

    <p>   ${a} >${b}  = ${a>b} </p>
    <p>   ${a} >${b}  = ${a gt b} </p>

    <p>   ${a} =${b}  = ${a==b} </p>
    <p>   ${a} =${b}  = ${a eq b} </p>

    <p>   ${a} !=${b}  = ${a!=b} </p>
    <p>   ${a} !=${b}  = ${a ne b} </p>

    <p>   ${a} =${c}  = ${a==c} </p>
    <p>   ${a} =${c}  = ${a eq c} </p>


<h3> 논리 연산자 </h3>
<h3> && , (and) , || ,  (or) </h3>
<p>${true && true} t</p>
<p>${true && false} f</p>
<p>${false && true } f</p>
<p>${false && false} f</p>

<p>${true || true} t</p>
<p>${true || false} t </p>
<p>${false || true } t</p>
<p>${false || false} f </p>


</body>
</html>
