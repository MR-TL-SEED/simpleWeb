<%-- 
    Document   : greeting
    Created on : Jan 26, 2025, 3:29:28 PM
    Author     : General_user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Greetings Page</title>
    </head>
    <body>
        <h1>Greetings!</h1>
        <%
        String greeting = (String)request.getAttribute("greeting");
        %>
        <p>
            <%=greeting%>
        </p> 
        <p>
             click <a href="index.html">here</a> to go back to main page
        </p>
    </body>
</html>
