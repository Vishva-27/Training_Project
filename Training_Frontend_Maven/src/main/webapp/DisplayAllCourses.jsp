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
<title>All Courses</title>
</head>
<body>
<jsp:include page="Admin.jsp" />
 <%
 				DataSource datasource= DataSourceUtil.dataSource();
                Connection connection = datasource.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultset = 
                		statement.executeQuery("select * from course");
 %>
 <div>
 <div style="margin-left:200px">
 <TABLE BORDER="1" style="width:100%">
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
 </div>
 </div>
</body>
</html>