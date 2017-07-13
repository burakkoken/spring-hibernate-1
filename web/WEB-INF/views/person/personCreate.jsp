<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 13.7.2017
  Time: 00:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>Person Create</h1>
    <form:form action="/person/createPerson" modelAttribute="person" method="post">
        <p>
            <form:label path="age">Name : </form:label>
            <form:input path="name" placeholder="Enter name"/>
        </p>
        <br>
        <p>
            <form:label path="age">Age : </form:label>
            <form:input path="age" placeholder="Enter age"/>
        </p>
        <p>
            <input type="submit" value="Save Person"/>
        </p>
    </form:form>

</body>
</html>
