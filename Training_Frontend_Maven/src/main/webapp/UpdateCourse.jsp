<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="javax.sql.DataSource" %>
<%@ page import="db.DBUtil" %>
<%@ page import="Training_Frontend_Controller.DataSourceUtil" %>
<!DOCTYPE html PUBLIC"-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Courses</title> 
 </head>
<body>
	        		<jsp:include page="Admin.jsp" />
	        		<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Course Form</h2>
	        		<hr>
	        		<%
	        		int co_id=(int) session.getAttribute("co_id");
	        		DataSource datasource= DataSourceUtil.dataSource();
	                Connection connection=datasource.getConnection();
	        			Statement statement = connection.createStatement();
	        	        ResultSet resultset = 
	        	        		statement.executeQuery("select * from course where course_id="+co_id);
	        	 
	        		%>
<div>
<div style="margin-left:200px"> 
<form action="updateop" method="post">
<pre>
Course ID       :  <input type="number" name="cou_id" ><br>
Name          :  <input type="text" name="cou_name"><br>
Description   :  <input type="text" name="cou_desp"><br>
Resources     :  <input type="text" name="cou_resource"><br>
Fees          :  <input type="text" name="cou_fees"><br>
     					<input type="submit" name="SUBMIT"> <input type="reset" name="reset"><br>
</pre> 
</form>
</div>
</div>	        			        		     
</body>
</html>