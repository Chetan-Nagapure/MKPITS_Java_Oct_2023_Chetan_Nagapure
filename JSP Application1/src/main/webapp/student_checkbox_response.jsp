<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student confirm</title>
</head>
<body>
student fullname : ${param.fname} ${param.lname} <!-- param = parameter -->
<br><br>
country          : ${param.country} 
<br><br>
Language         : ${param.favlanguage}
<br><br>

Hobbies are
<ul>
<%
    String[] hobbies = request.getParameterValues("city");
    for(String temp : hobbies)
   {
     out.println("<li>" + temp + "</li>");	
   }

%>
</ul>
</body>
</html>