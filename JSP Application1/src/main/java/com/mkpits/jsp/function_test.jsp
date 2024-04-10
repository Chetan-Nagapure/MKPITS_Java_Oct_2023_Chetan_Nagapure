<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function</title>
</head>
<body>
<c:set var="data" value="vinay"></c:set>
Length of String <b>${data}</b>:${fn:length(data)}
<br>
<br>
UpperCase of String <b>${data}</b>:${fn:toUpperCase(data)}
<br>
<br>
Does String <b>${data}</b> Start with vi :${fn:startsWith(data,"vi")}

</body>
</html>