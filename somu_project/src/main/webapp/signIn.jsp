<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
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
			width: 25%;
			padding: 25px;
			border: 5px solid #ccc;
			border-radius: 2px;
			box-shadow: 0px 2px 2px #ccc;
			background-color: #f5f5f5;
		}
		input[type="text"], input[type="password"] {
			padding: 10px;
			margin-bottom: 10px;
			border: 1px solid #ccc;
			border-radius: 5px;
			width: 100%;
		}
		input[type="submit"] {
			background-color: #4CAF50;
			color: white;
			padding: 10px;
			border: none;
			border-radius: 5px;
			cursor: pointer;
			width: 100%;
		}
		input[type="submit"]:hover {
			background-color: navy;
		}
		h3 {
			text-align: center;
		}
	</style>
</head>
<body>

 
    <nav class="navbar navbar-dark bg-primary">
        <a class="navbar-brand" href="#">
          <a href="index.jsp" class="btn btn-warning">Home</a>
           <a href="signUp.jsp" class="btn btn-warning">Sign Up</a>
      </a>
    </nav> <br> <br>
          
   
    
  
   
 
    
	<form action="login" method="post">

		<h4>Login Form</h4>
		
		<label for="name">Name:</label>
		<input type="text" id="name" name="name" placeholder="Enter your name" required> <br>
		
		<label for="password">Password:</label>
		<input type="password" id="password" name="password" placeholder="Enter your password" required> <br>
		
		<input type="submit" value="Login">
	</form>

    <h3>  ${msg}</h3>
</body>
</html>