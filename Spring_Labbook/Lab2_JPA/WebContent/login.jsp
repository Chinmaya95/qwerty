<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body background-color:red>
	<table border="1" align="center">
		<form action="validation.obj" method="post">

			<tr>
				<td>Username:</td>
				<td><input type="text" name="user" /></td>
			</tr>
			<tr>
				<td>password:</td>
				<td><input type="password" name="pwd" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Submit" /></td>
			</tr>


		</form>
	</table>
</body>