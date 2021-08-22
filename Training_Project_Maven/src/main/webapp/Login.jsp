<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<jsp:include page="index.jsp" />
<!-- <h2>Login</h2> -->
<hr>
<form action="login" method="post">
<pre>
     User ID   :  <input type="number" name="log_id"><br>
     Password  :  <input type="password" name="log_pass"><br>
     				<input type="submit" name="Login"> <input type="reset" name="reset"><br>
</pre>
     
</form>
</body>
</html>