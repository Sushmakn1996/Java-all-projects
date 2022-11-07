<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<label>LOGIN FORM</label>
	<form action="./login"></form>
<table>
	<tr>
		<td><label>Enter your email address:</label></td>
		<td><input type="email" name="empEmail"></td>
	</tr>
	
	<tr>
		<td><label>Enter your email password:</label></td>
		<td><input type="text" name="empPassword"></td>
	</tr>
	
	<tr>
		<td><input type="submit" value="Login"></td>
	</tr>
	
	<tr><td><a href="./register">Don't have account?? Click here to register</a></td></tr>
	
	</table>
	</fieldset>
</body>
</html>