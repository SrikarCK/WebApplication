<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: srika
  Date: 11/18/2018
  Time: 12:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>WebApplication Page</title>
  </head>
  <body>
 <h1>WebApplication Using Java</h1>
  <%
      Date date = new Date();
      out.print("<h2>"+ date.toString() + "</h2>");
  %>
  </body>
</html>
