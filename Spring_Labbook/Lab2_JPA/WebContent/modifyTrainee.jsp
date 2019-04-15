<%@page import="com.cg.bean.Trainee"%>
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
		<form action="getmodification.obj" method="post">
			<h1>Modify Operation</h1>
			<tr>
				<td>Please Enter Trainee ID:</td>
				<td><input type="text" name="id"></td>
			
				<td colspan="2"><input type="submit" value="GetEmployee"></td>
			</tr>
		</form>
	</table>
	<%
		String id = request.getParameter("id");
		String idl = "0";
		boolean flag = id.equals(idl);
		Trainee tr=(Trainee)request.getAttribute("trainee");
	%>

	<%
		if (!(flag)) {
	%>
	<table>
		<form action="modification.obj" method="post">
			<h1>Modify Operation</h1>
			<tr>
				<td>Trainee ID:</td>
				<td><input type="text" name="id" value="<%= tr.getTraineeId()%>"></td>
			</tr>
			<tr>
				<td>Trainee Name:</td>
				<td><input type="text" name="name" value="<%= tr.getTraineeName()%>"></td>
			</tr>
			<tr>
				<td>Trainee Location:</td>
				<td><input type="text" name="location" value="<%= tr.getTraineeLocation()%>"></td>
			</tr>
			<tr>
				<td>Trainee Domain:</td>
				<td><input type="text" name="domain" value="<%= tr.getTraineeDomain()%>"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Modify"></td>
			</tr>
		</form>
	</table>
	<%
		}
	%>





</body>
</html>