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
<title>Contact List</title>
</head>
<body>
<h2>Contact List</h2>
<%
 				DataSource datasource= DataSourceUtil.dataSource();
                Connection connection = datasource.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultset = 
                		statement.executeQuery("select * from contact");
 %>
 <TABLE BORDER="1">
           <TR>
                 <TH>User ID</TH>
                 <TH>Name</TH>
                 <TH>Email ID</TH>
                 <TH>Phone Number</TH>
                 <TH>Message</TH>
                 <TH>Contact ID</TH>
          </TR>
           <% while(resultset.next()){ %>
           <TR>
                <TD> <%= resultset.getString(1) %></td>
               <TD> <%= resultset.getString(2) %></TD>
               <TD> <%= resultset.getString(3) %></TD>
               <TD> <%= resultset.getString(4) %></TD>
               <TD> <%= resultset.getString(5) %></TD>
               <TD> <%= resultset.getString(6) %></TD>
          </TR>
           <% } %>
 </TABLE>
 <a href="Admin.jsp">Back to Dashboard</a>
</body>
</html>