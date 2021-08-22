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
<title>Admin Page</title>
<style>

th {
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body>
<h2>Welcome to Admin Page</h2>
<!-- <a href="Course.jsp">Enroll in Course!</a> -->
 <%
 				DataSource datasource= DataSourceUtil.dataSource();
                Connection connection = datasource.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultset = 
                		statement.executeQuery("select * from course");
 %>
 <TABLE BORDER="1">
           <TR>
                 <TH>Course ID</TH>
                 <TH>Course Name</TH>
                 <TH>Course description</TH>
                 <TH>Fees</TH>
                 <TH>Resources</TH>
          </TR>
           <% while(resultset.next()){ %>
           <TR>
                <TD> <%= resultset.getString(1) %></td>
               <TD> <%= resultset.getString(2) %></TD>
               <TD> <%= resultset.getString(3) %></TD>
               <TD> <%= resultset.getString(4) %></TD>
               <TD> <%= resultset.getString(5) %></TD>
          </TR>
           <% } %>
 </TABLE>
<ul>
<li><a href="Course.jsp">Add a new course</a></li>
<li><a href="ContactView.jsp">View Contacts of all Learners</a></li>
<li><a href="FeedbackView.jsp">View Feedbacks Received from all Learners</a></li>
<li><a href="index.jsp">Logout</a></li>
</ul>
</body>
</html>