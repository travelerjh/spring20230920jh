<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-10-10
  Time: 오전 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>



</head>
<body>
    <h4> 직원 조회</h4>
    <form action="">
    <div>
        검색조건
        <select name="t" id="">
            <option value="lname" ${t == 'lname' ? 'selected' : ''}>Last name</option>
            <option value="fname" ${t == 'fname' ? 'selected' : ''}>First name</option>
            <option value="note"${t == 'note' ? 'selected' : ''}>Notes</option>
        </select>
    </div>

    <div>
        검색어
        <input type="text" name="k" value="${k}">
    </div>
    <div>
        <button> 조회 </button>
    </div>
    </form>

    <table>
            <tr>
                <th>Last Name</th>
                <th>Frist Name</th>
                <th>Note</th>
            </tr>
        <c:forEach var="list" items="${list}">
            <tr>
                <td>${list.lname}</td>
                <td>${list.fname}</td>
                <td>${list.note}</td>
            </tr>

        </c:forEach>
    </table>


</body>
</html>
