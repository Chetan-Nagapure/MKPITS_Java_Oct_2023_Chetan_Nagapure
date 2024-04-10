<%@page import="java.util.Date"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="stuff" value="<%= new Date() %>"/>
Time on server is ${stuff}
<br>
<c:set var="cal" value="<%=7*5%>"/>
Multiplication is ${cal}
</body>
</html>