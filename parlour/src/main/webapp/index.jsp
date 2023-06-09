<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${msg}</h1>
<form action="datasave" method= "get">
Name<input type="text" name="name"> <br>
Mobile number<input type="number" name="mobile"> <br>
<input type = "submit" value = "submit">
</form>

<a href="FindById.jsp">Find By Id</a> <br>
<a href="findAll">Find All</a>
</body>
</html>