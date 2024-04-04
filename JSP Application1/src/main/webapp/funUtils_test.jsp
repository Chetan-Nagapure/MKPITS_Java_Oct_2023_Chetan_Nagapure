<%@page import="com.mkpits.jsp.JSPDemo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Fun Utils</h1><br>
Lets have some fun :<%= JSPDemo.makeItUpper("hello world") %>
</body>
</html>