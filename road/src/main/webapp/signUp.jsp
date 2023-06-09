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
<h1>signUp page executed</h1>
<form action="sign" method = "post">
<input type="text" name ="name" placeholder="name"><br>
<input type="text" name="distance" placeholder="distance"><br>
<input type="text" name="from" placeholder="from"><br>
<input type="text" name="to" placeholder="going to"><br> 
<input type="submit" value = "create">
</form>

</body>
</html>