<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-10-06
  Time: 오후 4:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <table>
        <tr>
            <th>customerId</th>
            <th>customerName</th>
        </tr>
        <c:forEach var="list" items="${list}">
            <tr>
                <td>${list.customerId}</td>
                <td>${list.customerName}</td>
            </tr>
        </c:forEach>
    </table>

    <div>
        <c:if test="${past > 0}">
        <a href="/main22/sub33?nowpage=${past}">   < </a>
        </c:if>
       <c:forEach begin="${leftpage}"  end="${rightpage}" var="nowpage">
           <a href="/main22/sub33?nowpage=${nowpage}"> ${nowpage}</a>
       </c:forEach>

        <c:if test="  ${rightpage >= next}     ">
        <a href="/main22/sub33?nowpage=${next}">   > </a>
        </c:if>
    </div>



</body>
</html>
