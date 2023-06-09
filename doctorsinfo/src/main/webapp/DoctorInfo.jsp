<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detail information</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg-navbar-Light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src=" https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-inline-block align text-top">
			</a>
			<a href="index.jsp">Home page</a>
			<a href="DoctorSerach.jsp">Search page</a>
		</div>
	</nav>
	<h1 style="color: green;">${message}</h1>
	<h5 style="color: red;">${messages}<br>
	<c:forEach items="${errors}" var="e">${e.message}</c:forEach>
	</h5>
	<form action="doctors" method="post">
	Doctor Name<input type="text" name="name"><br>
	Doctor Speciality<input type="text" name="speciality"><br>
	Doctor Age<input type="text" name="age"><br>
	Doctor Experience<input type="text" name="expereince"><br>
	Timing<select name="shift">
	<option value=" ">SELECT</option>
	<c:forEach items="${type}" var="p">
				<option value="${p}">${p}</option>
			</c:forEach>
	</select><br>
	<input type="submit" value="send">
	</form>

</body>
</html>