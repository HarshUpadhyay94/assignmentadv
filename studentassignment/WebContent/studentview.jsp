<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: cyan">
<form action="studentctl" method="get">
<center>
<table>
<br>
	<tr><td>Student Id<input type="text" name="id"></td></tr>
<br>
	<tr><td>Student Roll No<input type="text" name="rollno"></td></tr>
<br>
	<tr><td>First Name<input type="text" name="firstname"></td></tr>
<br>
	<tr><td>Last Name<input type="text" name="lastname"></td></tr>
<br>
	<tr><td>Session<input type="text" name="session"></td></tr>

<tr><td><input type="submit" name="operation" value="add">
<input type="submit" name="operation" value="delete">
<input type="submit" name="operation" value="modify"></td></tr>

</table>
</form>
</body>
</center>
</html>