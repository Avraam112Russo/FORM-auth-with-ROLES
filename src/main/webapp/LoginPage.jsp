<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 21.02.2024
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="j_security_check" method="post">
    <div>Username: </div><input type="text" name="j_username"><br/>
    <div>Password: </div><input type="password" name="j_password"><br/>
    <input type="submit" value="login">
</form>
</body>
</html>
