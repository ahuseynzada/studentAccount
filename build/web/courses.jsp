<%-- 
    Document   : courses
    Created on : Mar 7, 2021, 4:18:43 PM
    Author     : agali
--%>

<%@page import="package1.Courses"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Courses course = (Courses) session.getAttribute("loginStudent");
    if (course == null) {
        response.sendRedirect("index.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Courses Page</title>
    </head>
    <body>
        <h1>Welcome to the Board - Enroll the courses for free</h1>
        
        <div>
            <h1><%= course.getName()%></h1>
            <h3><%= course.getDescription()%></h3>
            <form method="post" action="Enroll">
                <input name="cid" type="text" value=<%=course.getId()%>>
                <input type="submit" value="Enroll"></input>
            </form>
        </div>
    </body>
</html>
