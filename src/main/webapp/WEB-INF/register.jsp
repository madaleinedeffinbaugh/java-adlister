<%--
  Created by IntelliJ IDEA.
  User: madaleinedeffinbaugh
  Date: 6/26/23
  Time: 1:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Sign Up</title>
</head>
<body>
<form method="post" action="/register">
  <label for="username">Username</label>
  <input type="text" name="username" id="username" required>
  <label for="email">Email</label>
  <input type="email" name="email" id="email" required>
  <label for="password">Password</label>
  <input type="password" name="password" id="password" required>
  <button>Sign Up!</button>
</form>
</body>
</html>
