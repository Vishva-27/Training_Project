<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<style>
.active {
  background-color: #04AA6D;
}
</style>
</head>
<body>
<jsp:include page="index.jsp" />
<!-- <h2>Register Here</h2> -->
<hr>
<form action="register" method="post">
<pre>
     User ID   :  <input type="number" name="id"><br>
     Name   :  <input type="text" name="name"><br>
     Phone   :  <input type="number" name="phone"><br>
     Email ID   :  <input type="text" name="email"><br>
     Address   :  <input type="text" name="addr"><br>
     Reg Date   :  <input type="text" name="date"><br>
     Password  :  <input type="password" name="pass"><br>
     Upload Photo :  <input type="text" name="photo"><br>
     				<input type="submit" name="Sign Up"> <input type="reset" name="reset"><br>
</pre>
     
</form>
</body>
</html>