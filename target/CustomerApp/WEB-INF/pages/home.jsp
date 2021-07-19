<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer Management Screen</title>
</head>
<body>
	<div align="center">
		<h1 style="color:red;">Customer List</h1>
		
		<table border="1" >

			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Gender</th>
			<th>Age</th>
			<th>Address</th>
			<th>Nationality</th>


			<c:forEach var="customer" items="${listCustomer}">
				<tr>
					<td>${customer.firstname}</td>
					<td>${customer.lastname}</td>
					<td>${customer.email}</td>
					<td>${customer.mobile}</td>
					<td>${customer.gender}</td>
					<td>${customer.age}</td>
					<td>${customer.address}</td>
					<td>${customer.nationality}</td>
				</tr>
			</c:forEach>
		</table>
		<h4>
			New Customer Register <a href="newCustomer">here</a>
		</h4>
	</div>
</body>
</html>