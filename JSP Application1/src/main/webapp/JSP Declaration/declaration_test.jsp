<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Declaration of JSP</h1>
<%!
String makeitLower(String data)
{
 return data.toLowerCase(); 
}
%>
Lower case "Hello World":<%= makeitLower("Hello World") %>



</body>
</html>