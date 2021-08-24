<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact Page</title>
<style>
.active {
  background-color: #04AA6D;
}
</style>
</head>
<body>
<jsp:include page="User.jsp" />
<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CONTACT FORM</h2>
<hr>
<div>
 <div style="margin-left:200px">
<form action="contact" method="post">
<pre>
     User ID   :  <input type="number" name="c_id"><br>
     Name      :  <input type="text" name="c_name"><br>
     Email ID  :  <input type="text" name="c_email"><br>
     Phone     :  <input type="number" name="c_phone"><br>
     Message   :  <input type="text" name="c_msg"><br>
     				<input type="submit" name="SUBMIT"> <input type="reset" name="reset"><br>
</pre>
</form>
</div></div>

</body>
</html>