<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello world of JSP</h1>
<%for(int index=0; index<5; index ++)
	{
	 out.println("<br> I really love JSP code");
	}%>
</body>
</html>