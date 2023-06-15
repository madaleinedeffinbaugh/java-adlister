<%--
  Created by IntelliJ IDEA.
  User: madaleinedeffinbaugh
  Date: 6/15/23
  Time: 12:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Pick a number 1-3</h1>
<form action="/guess" METHOD="POST">
    <input type="text" name="userGuess" id="userGuess">
    <button type="submit">Submit</button>
</form>
</body>
</html>
