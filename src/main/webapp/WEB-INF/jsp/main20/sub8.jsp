<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-10-05
  Time: 오후 2:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>

    <h4>   상품의 조회     </h4>

    <table>
        <tr>
                <th>productid</th>
                <th>productName</th>
                <th>price</th>
        </tr>
        <c:forEach var="list" items="${list}">
            <tr>
                <td>${list.productid}</td>
                <td>${list.productName}</td>
                <td>${list.price}</td>
            </tr>
        </c:forEach>


    </table>





  </body>
</html>
