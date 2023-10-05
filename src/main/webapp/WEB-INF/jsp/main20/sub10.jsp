<%--
  Created by IntelliJ IDEA.
  User: cjhee
  Date: 2023-10-05
  Time: 오후 4:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h2> 국가로 공급자 조회 </h2>

    <form action="/main20/sub11" id="form1">

        <button>조회</button>
        <button type="button" id="addButton">
            +
        </button>




        <select name="country" id="" class="select1">
            <c:forEach items="${countryList}" var="country">
                <option value="${country}"> ${country}</option>
            </c:forEach>
        </select>
    </form>

    <script>
        document.querySelector("#addButton").addEventListener("click",function(){
           const selctElem = document.querySelector(".select1");
           const copyElem = selctElem.cloneNode(true);

           selctElem.before(copyElem);
            selctElem.before(document.createElement("br"));
        });

    </script>



</body>
</html>
