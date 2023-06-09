<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>

  <link rel="stylesheet" href=
"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
	
	<style type="text/css">
		body {
     
			
			background-size: cover;
			background-repeat: no-repeat;
		}
		form {
			margin: 0 auto;
			width: 30%;
			padding: 10px;
			border: 5px solid #ccc;
			border-radius: 2px;
			box-shadow: 0px 2px 2px #ccc;
			background-color: #f5f5f5;
		}
		input[type="text"],input[type="number"], input[type="email"], input[type="password"] {
			padding: 1px;
			margin-bottom: 0.5px;
			border: 1px solid #ccc;
			border-radius: 2px;
			width: 100%;
		}
		input[type="submit"] {
			background-color: #4CAF50;
			color: white;
			padding: 2px;
			border: none;
			border-radius: 10px;
			cursor: pointer;
			width: 100%;
		}
		input[type="submit"]:hover {
			background-color: #45a049;
		}
		h4 {
			text-align: center;
		}
		h3{
		text-align: center;
		color: green;
		font-family: cursive;
		
		}
	</style>
</head>
<body>

 
    <nav class="navbar navbar-dark bg-primary">
        <a class="navbar-brand" href="#">
          <a href="index.jsp" class="btn btn-warning">Home</a>
           <a href="signIn.jsp" class="btn btn-warning">Login</a>
      </a>
    </nav>
          
     
    </nav>
<h3>${msg}</h3>


        <c:forEach items="${save}" var="s">
        ${s.message}
        </c:forEach>
    
	<form action="save" method="get">

	<h4>Register Here</h4>
		
		<label for="name">Name:</label>
		<input type="text" id="name" name="name" placeholder="Enter your name" required> <br>
		<label for="email">Email:</label>
		<input type="email" id="email" name="email" placeholder="Enter your email" required><br>
		<label for="mobile">Mobile number:</label>
		<input type="number" id="mobile" name="mobile" placeholder="Enter your mobile number" required> <br>
		<label for="password">Password:</label>
		<input type="password" id="password" name="password" placeholder="Enter your password" required> <br>
		<label for="password">Confirm your Password:</label>
		<input type="password" id="password" name="password" placeholder="Enter your password" required> <br>
		<input type="submit" value="Register">
	</form>


</body>
</html>