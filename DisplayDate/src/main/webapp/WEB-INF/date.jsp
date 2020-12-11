<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Date</title>
	<link rel="stylesheet" type="text/css" href="css/date.css">
	<script type="text/javascript" src="js/date.js"></script>
</head>
<body>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<h1><c:out value="${day}"/>, the <c:out value="${date}"/> of <c:out value="${month}"/>, 
	<c:out value="${year}"/></h1>
	<br />
	<a href="/">Go Back</a>

</body>
</html>