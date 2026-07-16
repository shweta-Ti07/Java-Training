<%@page import="jakarta.servlet.http.HttpSession"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

	<% 
	String  email=null;
	HttpSession session1=request.getSession(false);
		if(session1!=null){
		email=(String)session1.getAttribute("email");
		System.out.println(session.getId());
		out.println(" Welcome User with email:"+ email); 
	%>
	<a href="LogoutServlet">Logout</a>
	<%
		}
		else{
			response.sendRedirect("login.jsp");	
		}
	
	%>
	

</body>
</html>