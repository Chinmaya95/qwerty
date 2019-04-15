<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4><a href="success.jsp">Home</a></h4>
	<table>
		<form action="delete.obj" method="post">
			<h1>Delete Trainee</h1>
			<tr>
				<td>Please Enter Trainee ID:</td>
				<td><input type="text" name="id"></td>

				<td colspan="2"><input type="submit" value="Delete Employee"></td>
			</tr>
		</form>
	</table>
	
</body>
</html>