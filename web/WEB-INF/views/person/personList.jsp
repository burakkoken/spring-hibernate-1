<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 13.7.2017
  Time: 00:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Person List</h1>

<c:forEach var="person" items="${personList}">
    <p>
        Id : ${person.id}, Name : ${person.name}, Age : ${person.age}
    </p>
</c:forEach>

</body>
</html>
