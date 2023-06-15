
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            background-color: <%= request.getParameter("color") %>;
        }
    </style>
</head>
<body>
<h1>Your color: <%= request.getParameter("color") %></h1>
</body>
</html>
