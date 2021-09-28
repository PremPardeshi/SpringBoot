<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
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
    		<th>IDname</th>
    		<th>Name</th>
    		<th>Dept</th>
    		<th>Salary</th>
  		</tr>
  		<c:forEach var="t1" items="${lst2}">
				<tr>
					
  					<td><c:out value="${t1.id}"/></td> 
				
				
				
					
					<td><c:out value="${t1.name}"/></td>
			
					
					<td><c:out value="${t1.dept}"/></td>
				
				
				
					
					<td><c:out value="${t1.salary}"/></td>
				</tr>
		</c:forEach>	
				
			</table>
			
			
			<a href="welcome">BACK TO HOME PAGE</a>
</center>
</body>
</html