<%-- 
    Document   : register.jsp
    Created on : Mar 7, 2021, 4:57:09 AM
    Author     : agali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <h1>REGISTER</h1>
        <form method="post" action="Register">
            <input type="email" placeholder="Enter your e-mail" name="email" required>
            <input type="password" placeholder="Enter your password" name="password" required>
            <input type="submit" value="Register">
            <a href="login.jsp">If you have an account sign in</a>
        </form>
    </body>
</html>
