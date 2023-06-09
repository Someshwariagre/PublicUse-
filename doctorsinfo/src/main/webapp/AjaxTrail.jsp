<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<!-- 	<div id="demo">
		<h2>The XMLHttpRequest Object</h2>
		<button type="button"
			onclick="loadDoc('http://localhost:8088/docotorsinfo/dto', myFunction)">Change
			Content</button>
	</div> -->

	<script>
	/*	function loadDoc(url, xFunction) {
			const xhttp = new XMLHttpRequest();
			xhttp.onload = function() {
				xFunction(this);
			}
			xhttp.open("GET", url);
			xhttp.send();
		}
		function myFunction(xhttp) {
			document.getElementById("demo").innerHTML = xhttp.responseText;
			
			var obj = JSON.parse(responseText);
			document.getElementById("demo").innerHTML = obj;
		} */
		</script>
			Highway Id:
		 <input type="text" id="DoctorId">
		 <button onclick="loadDto()">Click</button>
		 <span id="trimmerId"></span>
		 <div id="displayDto"></div>

		 <script>
		 function loadDto() {
		 console.log('running loadDto');
		 const xhttp = new XMLHttpRequest();
		 var id = document.getElementById("Doctor ID").value=this.responseText;
		 xhttp.open("GET", "http://localhost:8088/docotorsinfo/dto");
		 xhttp.send();
		 xhttp.onload = function() {
		 console.log(this);
		 document.getElementById("displayDto").innerHTML = this.responseText;
		 const json = JSON.parse(this.responseText);
		 document.getElementById("trimmerId").innerHTML=json.id;
		 }
		 }
	</script>
</body>
</html>
