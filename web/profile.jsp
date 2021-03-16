<%-- 
    Document   : profile.jsp
    Created on : Mar 7, 2021, 4:18:21 PM
    Author     : agali
--%>

<%@page import="package1.CoursesData"%>
<%@page import="package1.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  Student student = (Student) session.getAttribute("loginStudent");
    if (student == null) {
        response.sendRedirect("index.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
    </head>
    <body>
        <h1>Welcome, <%= student.getName()%><%= student.getSurname()%></h1>
        <h3>Your Country: <%= student.getCountry()%></h3>
        <h3>Your Email: <%= student.getEmail()%> </h3>
        <h3>Your University: <%= student.getUniversity()%></h3>
        <h3>Your Faculty: <%= student.getFaculty()%></h3>
        <h3>Your Age <%= student.getAge()%></h3>
        
        <div>
            <h2>Enrolled Courses</h2>
            <div>
                <h3><%= student.getCourses()%></h3>
            </div>
        </div>

        <button><a href="courses.jsp">See all Courses</a></button>
        <button><a href="Logout">Log Out</a></button>
    </body>
</html>

