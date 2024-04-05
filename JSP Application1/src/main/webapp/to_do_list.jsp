<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
<form action="to_do_list.jsp" method="post">


<input type="text" name="toDo">
<input type="submit" value="submit"></input>
</form>

<h1>Item Entered:<%= request.getParameter("toDo")%></h1>

<!-- Add New Item To List -->
<!-- Get ToDo Items From Session -->
<!-- if ToDo Item does not exist then create new -->
<!-- See If there is form data to add -->



<%  List<String> items=(List<String>)session.getAttribute("myToDoList");
    if(items==null){
    	items=new ArrayList<String>();
    	session.setAttribute("myToDoList",items);
    }
    
    String theItem=request.getParameter("toDo");
    if((theItem!=null)&&(!theItem.trim().equals(""))){
    	items.add(theItem);
    }

%>

<strong>List of Item is <br>
<ol>
<% for(String temp:items){
	out.println("<li>"+temp+"</li>");
}%>
</ol>
</strong>

</body>
</html>