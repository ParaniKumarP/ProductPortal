<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>PRODUCT DETAILS</h1>
<table  border=2 cellspacing=1 cellpadding=5>
	<tr>
			<th>Product id</th><th>Name</th><th>Cost</th>
	</tr>
	<tr>
	<td><%= session.getAttribute("id") %></td>
	<td><%= session.getAttribute("name")%></td>
	<td><%= session.getAttribute("cost")%></td>

	</tr>
	
</table>
</body>
</html>