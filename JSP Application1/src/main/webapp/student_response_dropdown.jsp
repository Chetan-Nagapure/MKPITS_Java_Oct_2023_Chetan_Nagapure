<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="student_response.jsp" method="post">
	First Name : <input type="text" name="fname"/>
	<br><br>
	Last Name : <input type="text" name="lname"/>
	<br><br>
	<select name="country">
		<option>India</option>
		<option>USA</option>
		<option>UK</option>
		<option>Dubai</option>
		<option>Germany</option>
	</select>
	<br><br>
	<input type="submit" value="submit"/>
	
</form>

</body>
</html>