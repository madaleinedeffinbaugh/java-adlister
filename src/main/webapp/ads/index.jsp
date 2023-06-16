<%--
  Created by IntelliJ IDEA.
  User: madaleinedeffinbaugh
  Date: 6/15/23
  Time: 9:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Here are all the ads:</h1>

<c:forEach var="ad" items="${adsList}">
    <div>
        <h2>${ad.title}</h2>
        <p>Description: ${ad.description} </p>
    </div>
</c:forEach>

</body>
</html>
