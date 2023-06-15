<%--
  Created by IntelliJ IDEA.
  User: madaleinedeffinbaugh
  Date: 6/14/23
  Time: 11:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
<h1>Pick a Color!</h1>
<form action="/pickcolor" method="POST">
    <label for="color">Enter Color Here:</label>
    <input type="text" name="color" id="color">
    <button type="submit">Submit</button>
</form>
</body>
</html>
