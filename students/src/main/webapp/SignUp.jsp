<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
		body {
              /* <img src=  style="border-radius: 50%;"  width="100%" height="100%" >   */
			background-image: url('background.jpg');
			background-size: cover;
			background-repeat: no-repeat;
		}
		form {
			margin: 0 auto;
			width: 20%;
			padding: 30px;
			border: 1px solid #ccc;
			border-radius: 5px;
			box-shadow: 0px 2px 2px #ccc;
			background-color: #f5f5f5;
		}
		input[type="text"], input[type="email"], input[type="password"] {
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
			background-color: #45a049;
		}
		h2 {
			text-align: center;
		}
	</style>
</head>
<body>
<form action="sign" method = "post">
       
		<h2>Login Form</h2>
		<label for="id">ID:</label>
		<input type="text" id="id" name="id" placeholder="Enter your ID" required>
		<label for="name">Name:</label>
		<input type="text" id="name" name="name" placeholder="Enter your name" required>
		<label for="email">Email:</label>
		<input type="email" id="email" name="email" placeholder="Enter your email" required>
		<label for="password">Password:</label>
		<input type="password" id="password" name="password" placeholder="Enter your password" required>
		<input type="submit" value="Login">
	</form>
</body>
</html>