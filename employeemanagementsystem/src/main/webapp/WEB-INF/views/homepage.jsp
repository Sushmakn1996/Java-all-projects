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
<label>REGISTRATION FORM</label>
	<form action="./register"></form>
<table>
<tr>
		<td><label>Enter your employee ID:</label></td>
		<td><input type="text" name="empId"></td>
</tr>
		
<tr>
		<td><label>Enter your Name:</label></td>
		<td><input type="text" name="empName"></td>
</tr>

<tr>
		<td><label>Enter your email address:</label></td>
		<td><input type="email" name="empEmail"></td>
</tr>

<tr>
		<td><label>Enter your email password:</label></td>
		<td><input type="text" name="empPassword"></td>
</tr>

<tr>
		<td><input type="submit" value="Register">
		<input type="submit" value="Reset"></td>
</tr>

<tr>
		<td><a href="./login">Have an account?? Click here to login</a></td>
</tr>

</table>
</fieldset>

</body>
</html>