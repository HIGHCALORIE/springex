<%--
  Created by IntelliJ IDEA.
  User: Lim
  Date: 2022-11-14
  Time: 오전 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>register</title>
</head>
<body>
<form action = "/todo/register" method="post">
    <div>
        title : <input type = "text" name = "title">
    </div>
    <div>
        duedate : <input type = "text" name = "dueDate" value="2022-11-14">
    </div>
    <div>
        writer : <input type = "text" name = "writer">
    </div>
    <div>
        finished : <input type = "text" name = "finished">
    </div>
    <div>
        <button type = "submit">cc</button>
    </div>
</form>

</body>
</html>