<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employ Detalis</title>
<link rel="stylesheet" href="styles.css">


<script>
	// Function to generate a random color in hexadecimal format (#RRGGBB)
	function getRandomColor() {
		const letters = '0123456789ABCDEF';
		let color = '#';
		for (let i = 0; i < 6; i++) {
			color += letters[Math.floor(Math.random() * 16)];
		}
		return color;
	}

	// Function to set a random background color for the container
	function setRandomBackgroundColor() {
		const container = document.querySelector('.container');
		if (container) {
			container.style.backgroundColor = getRandomColor();
		}
	}

	// Set random background color when the page loads
	window.onload = setRandomBackgroundColor;
</script>
</head>
<body background="Black">
	<%
	String msg = (String) session.getAttribute("msg");
	String name = (String) session.getAttribute("name");
	String gender = (String) session.getAttribute("gender");
	String email = (String) session.getAttribute("email");
	if (msg != null && msg.equals("Logged in Successfully")) {
	%>
	<div class="container">
		<h1>Employ Detalis</h1>
		<table>
			<tr>
				<td>Name:</td>
				<td><%=name%></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><%=gender%></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><%=email%></td>
			</tr>
		</table>
	</div>
	<%
	}
	session.removeAttribute("msg");
	%>
		
		
		<form  method="post" action="all">
          
          
			<input type="submit" value="Collgeues">
         
          </form>
         
	

	
</body>
</html>
