<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="findById">
		<input type="search" name="id">
		 <input type="submit" value="submit">
	</form>
	<div align="center">
		<h4>${msg}</h4>
		<table>
			<tr>
				<td>ID</td>
				<td>Name</td>
				<td>Mobile</td>
				<td>Update</td>
				<td>Delete</td>
			</tr>
			<tr>
				<td>${dto.id}</td>
				<td>${dto.name}</td>
				<td>${dto.mobile}</td>
				<td><a href="update?id=${dto.id}">Edit</a></td>
			</tr>
		</table>
	</div>
	<div>
		<form action="findByName" method="post">
			<input type="search" name="name" placeholder="search by name">
			<input type="submit" value="submit">
		</form>
	</div>
	<div align="center">
		<h4>${msg}</h4>
		<table>
			<tr>
				<td>ID</td>
				<td>Name</td>
				<td>Mobile</td>
				<td>Update</td>
				<td>Delete</td>
			</tr>
			<c:forEach items="${list}" var="s">
				<tr>
					<td>${s.id}</td>
					<td>${s.name}</td>
					<td>${s.mobile}</td>
					<td><a href="update?id=${s.id}">Edit</a></td>
					<td><a href="delete?id=${s.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>