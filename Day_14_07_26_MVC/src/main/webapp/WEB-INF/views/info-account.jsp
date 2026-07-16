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
	<h1>Account Details</h1>
	<table class="table table-bordered table-striped">

		<tr>

			<th>Account Number</th>

			<td>${account.accNo}</td>

		</tr>

		<tr>

			<th>Account Holder Name</th>

			<td>${account.accHolderName}</td>

		</tr>

		<tr>

			<th>Bank Name</th>

			<td>${account.bankName}</td>

		</tr>

		<tr>

			<th>Address</th>

			<td>${account.address}</td>

		</tr>

		<tr>

			<th>Balance</th>

			<td>₹ ${account.balance}</td>

		</tr>

	</table>
</body>
</html>