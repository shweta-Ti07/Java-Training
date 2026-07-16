<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<h1>Update Account</h1>

	<form:form action="../../accounts/modify" method="post" modelAttribute="account">

		<div class="mb-3">

			<label class="form-label">Account Number</label>

			<form:input path="accNo" cssClass="form-control" readonly="true" />

		</div>

		<div class="mb-3">

			<label class="form-label">Account Holder Name</label>

			<form:input path="accHolderName" cssClass="form-control" />

		</div>

		<div class="mb-3">

			<label class="form-label">Bank Name</label>

			<form:input path="bankName" cssClass="form-control" />

		</div>

		<div class="mb-3">

			<label class="form-label">Address</label>

			<form:textarea path="address" cssClass="form-control" rows="3" />

		</div>

		<div class="mb-3">

			<label class="form-label">Balance</label>

			<form:input path="balance" cssClass="form-control" />

		</div>

		<div class="d-grid">

			<button type="submit" class="btn btn-primary">Update Account

			</button>

		</div>

	</form:form>
	
	
</body>
</html>