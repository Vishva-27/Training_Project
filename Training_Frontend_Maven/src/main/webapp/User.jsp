<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page import="db.DBUtil" %>
<%@ page import="javax.sql.*" %>
<%@ page import="Training_Frontend_Controller.DataSourceUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Page</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  width: 12%;
  background-color: linen;
  height: 100%;
  position: fixed; 
  overflow: auto; 
}
body {
  background-color: linen;
}

h2 {
  color: maroon;
  margin-left: 40px;
}
th {
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body>
<h2>Welcome to User Page</h2>
 
 <ul>
 <li><a href="Displayenrolledcourse.jsp">Display Enrolled Courses</a></li>
<li><a href="Enroll.jsp">Enroll in New Courses</a></li>
<li><a href="Contact.jsp">Add Contact Details</a><br></li>
<li><a href="Feedback.jsp">Give Your Feedback</a><br></li>
<li><a href="Login.jsp">Logout</a></li>
 </ul>
</body>
</html>