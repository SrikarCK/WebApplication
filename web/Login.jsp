<%--
  Created by IntelliJ IDEA.
  User: srika
  Date: 11/21/2018
  Time: 12:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>WelCome, Please login:</h1>
    
     <form action="/login" method="post">
        login-name:<input type="text" name="loginname" width="30"/>
        password:<input type="password" name="password" width="10"/>
        <input type="submit" value="login"/>
    </form>

    <p style="color:red;">${ErrorMessage}</p>
</body>
</html>
