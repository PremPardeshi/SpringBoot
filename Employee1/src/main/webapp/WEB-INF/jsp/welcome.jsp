<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

form {
	margin: 5px;
}

</style>
</head>
<body style="color: light maroon;">
<center>
<form action="get">
<input type="submit" value="View Employee Information">
</form>

<form action="getbyid">
<input type="submit" value="View Employee Information Based On iD">
</form>

<form action="add">
<input type="submit" value="Add Employee Information">
</form>

<form action="del">
<input type="submit" value="Delete Employee Information">
</form>
<form action="updatee">
<input type="submit" value="Updated Employee Salary">
</form>
<form action="range">
<input type="submit" value="Employees who's salary in BEtween">

<br><br>
</center>
</body>
</html>