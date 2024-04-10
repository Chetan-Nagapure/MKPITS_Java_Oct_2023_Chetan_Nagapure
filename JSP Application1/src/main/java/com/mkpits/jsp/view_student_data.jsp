<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Table</title>
</head>
<body>
<table border="1"><tr><th>FirstName</th> <th>LastName</th><th>IdCustomer</th></tr>
	 <c:forEach var="tempStudent" items="${student_list}">
    <tr><td>${tempStudent.firstName}</td>
       <td>${tempStudent.lastName}</td>
        <td>${tempStudent.email}</td></tr>
     
        <br>
    </c:forEach>
    </table>
</body>
</html>