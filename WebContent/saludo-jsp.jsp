<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Primer JSP</title>
	</head>
<body>
	<h1>Primer Java Server Page - JSP</h1>
	<p> Hoy es:
         <%= new java.util.Date() %>
    </p>
    
	<b> Hola mundo,
		<i><%@ include file = "saludo.jsp" %></i>
	</b>
</body>
</html>