<%@page import="com.mkpits.model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>if</title>
</head>
<body>
	<%
	List<Student> data = new ArrayList<Student>();
	data.add(new Student("Vinay", "Thaware", false));
	data.add(new Student("Raj", "Warhokar", true));
	data.add(new Student("Regved", "Pande", false));
	data.add(new Student("Harsh", "Gupta", true));
	pageContext.setAttribute("myStudent",data);
	%>
	<table border="1"><tr><th>FirstName</th> <th>LastName</th><th>IdCustomer</th></tr>
	 <c:forEach var="tempStudent" items="${myStudent}">
    <tr><td>${tempStudent.firstName}</td>
       <td>${tempStudent.lastName}</td>
        <td><c:if test="${tempStudent.isgoIdCustomer}">Special Discount</c:if>
        <c:if test="${not tempStudent.isgoIdCustomer}">---</c:if></td></tr>
     
        <br>
    </c:forEach>
    </table>
</body>
</html>