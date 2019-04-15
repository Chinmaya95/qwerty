<%@page import="com.cg.bean.Trainee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4><a href="success.jsp">Home</a></h4>
<table>
		<form action="gettrainee.obj" method="post">
			<h1>Retrieve Operation</h1>
			<tr>
				<td>Please Enter Trainee ID:</td>
				<td><input type="text" name="id"></td>
			
				<td colspan="2"><input type="submit" value="GetEmployee"></td>
			</tr>
		</form>
	</table>
	
	
	<%
	
		String id="0"; 
		id = request.getParameter("id");
		String idl = "0";
		boolean flag = id.equals(idl);
		Trainee tr=(Trainee)request.getAttribute("trainee");
	%>

	<%
		if (!(flag)) {
	%>
	<h1>Trainee Info</h1>
	<table border="1">
		<tr><th>ID</th><th>NAME</th><th>LOCATION</th><th>DOMAIN</th></tr>
		<tr><td><%=tr.getTraineeId() %></td><td><%=tr.getTraineeName() %></td><td><%=tr.getTraineeLocation() %></td><td><%=tr.getTraineeDomain() %></td></tr>
	</table>
	<%
		}
	%>
	
	
</body>
</html>