<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib uri="jakarta.tags.core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<h1>Accounts List</h1>
<a href="accounts/add" class="btn btn-primary">Add</a>
<table class="table table-striped">

	<tr>
		<th>AccountId</th>
		<th>AccountHolderName</th>
		<th>BankName</th>
		<th>Actions</th>
	</tr>
	
	<core:forEach items="${accountList}" var="acc">
		<tr>
			<td>${acc.accNo}</td>
			<td>${acc.accHolderName}</td>
			<td>${acc.balance}</td>
			<td>
				<a  href="accounts/update/${acc.accNo}" class="btn btn-success">Update</a>
				<a href="accounts/delete/${acc.accNo}" class="btn btn-danger">Delete</a>
				<a href="accounts/info/${acc.accNo}" class="btn btn-info">Info</a>
			</td>
			
		</tr>
	</core:forEach>
</table>

</body>
</html>