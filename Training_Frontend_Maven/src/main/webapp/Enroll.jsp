<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="javax.sql.DataSource" %>
<%@ page import="db.DBUtil" %>
<%@ page import="Training_Frontend_Controller.DataSourceUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enroll in new Courses</title>
<style>
.active {
  background-color: #04AA6D;
}
</style>
</head>
<body>
<jsp:include page="User.jsp" />
<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Course Enrollment Page</h2>
 <%
				DataSource dataSource = DataSourceUtil.dataSource();
                Connection connection = dataSource.getConnection();
                Statement statement = connection.createStatement();
                int user_id= (int)session.getAttribute("u_id");
                ResultSet resultset = 
                		statement.executeQuery("select * from course where course_id not in(select course_id from user_course where user_course.user_id="+user_id+")");
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
                 <TH>Action</TH>
          </TR>
           <% while(resultset.next()){ %>
           <TR>
                <TD> <%= resultset.getString(1) %></td>
               <TD> <%= resultset.getString(2) %></TD>
               <TD> <%= resultset.getString(3) %></TD>
               <TD> <%= resultset.getString(4) %></TD>
               <TD> <%= resultset.getString(5) %></TD>
               <TD><form action='enroll' method = 'POST' onsubmit=''> <input type='hidden' name='q' value=<%session.setAttribute("ch_id", Integer.parseInt(resultset.getString(1)));%>/><input type='Submit' value='Enroll'/></form></TD>
          </TR>
           <% } %>
 </TABLE>
 </div></div>
<a href="index.jsp">Logout</a>
</body>
</html>