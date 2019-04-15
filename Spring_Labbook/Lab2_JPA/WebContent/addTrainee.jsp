<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Enter Trainee Details</h3>
<form action="add.obj" method="post">
Trainee ID: <input type="text" name="id" id=user><br>
Trainee Name: <input type="text" name="name" id=user><br>
Preferred Location:<input type="radio" name="location" value="Chennai">Chennai<input type="radio" name="location" value="Banglore">Banglore</input>
<input type="radio" name="location" value="Pune">Pune</input>
<input type="radio" name="location" value="Mumbai">Mumbai</input><br>
Trainee Domain:<select name="domain">
<option>Select</option>
<option value="c">C</option>
<option value="cpp">C++</option>
<option value="java">Java</option>
<option value="angular">Angular</option>
</select><br>
<input type="submit" value="Submit">
</form>
</form>
</body>
</html>