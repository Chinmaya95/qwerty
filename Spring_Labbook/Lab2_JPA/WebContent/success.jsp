<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h5>${msg}</h5>
<h1>Trainee Management System</h1>
<table border="1">
<% String id="0"; %>
<tr><td>Pick Your Option</td></tr>
<tr><td><a href="addTrainee.jsp">Add a Trainee</a></td></tr>
<tr><td><a href="deleteTrainee.jsp">Delete a Trainee</a></td></tr>
<tr><td><a href=<%="modifyTrainee.jsp?id="+id %>>Modify a Trainee</a></td></tr>
<tr><td><a href=<%="getTrainee.jsp?id="+id %>>Retrieve a Trainee</a></td></tr>
<tr><td><a href="all.obj">Retrieve all Trainee</a></td></tr>

</table>

</body>
</html>