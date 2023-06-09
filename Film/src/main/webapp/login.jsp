<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>login page executed</h1>
<form action="save" method = "post">
<input type="text" name ="name" placeholder="name"><br>
<input type="text" name="heroName" placeholder=""heroName""><br>
<input type="text" name="Language" placeholder="Language"><br>
<input type="submit" value = "create">
</form>
<h1>${Result}</h1>
</body>
</html>