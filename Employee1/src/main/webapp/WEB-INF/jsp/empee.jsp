<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<table>

		<tr>
    		<th>ID</th>
    		<th>Name</th>
    		<th>Dept</th>
    		<th>Salary</th>
  		</tr>
  		
				<tr>
					
					<td><c:out value="${e.id}"/></td>
				
				
				
					
					<td><c:out value="${e.name}"/></td>
			
					
					<td><c:out value="${e.dept}"/></td>
				
				
				
					
					<td><c:out value="${e.salary}"/></td>
				</tr>	
				
			</table>
			<a href="welcome">BACK TO HOME PAGE</a>
</center>
</body>
</html>