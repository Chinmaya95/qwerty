<%@page import="java.util.List"%>
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
<table border="1">
<%List<Trainee> lis=(List<Trainee>)request.getAttribute("trainee");
%>
<tr><th>ID</th><th>NAME</th><th>LOCATION</th><th>DOMAIN</th></tr>

<%for(Trainee tr:lis) {%>
<tr><td><%=tr.getTraineeId() %></td><td><%=tr.getTraineeName() %></td><td><%=tr.getTraineeLocation() %></td><td><%=tr.getTraineeDomain() %></td></tr>
<%}%>


</table>


</body>
</html>