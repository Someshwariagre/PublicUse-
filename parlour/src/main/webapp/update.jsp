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
<form action="update" method= "post">
ID<input type = "number" name = "id" value="${dto.id}"   readonly="readonly">
Name<input type="text" name="name" value="${dto.name}"> <br>
Mobile number<input type="number" name="mobile" value="${dto.mobile}"> <br>
<input type = "submit" value = "submit">
</form>

<a href="FindById.jsp">Find By Id</a>
</body>
</html>