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
	<h1>Account Form</h1>
	
	<form  action="create" method="post">

                        <div class="mb-3">

                            <label class="form-label">Account Number</label>

                            <input type="number"

                                   class="form-control"

                                   name="accNo"

                                   required>

                        </div>

                        <div class="mb-3">

                            <label class="form-label">Account Holder Name</label>

                            <input type="text"

                                   class="form-control"

                                   name="accHolderName"

                                   required>

                        </div>

                        <div class="mb-3">

                            <label class="form-label">Bank Name</label>

                            <input type="text"

                                   class="form-control"

                                   name="bankName"

                                   required>

                        </div>

                        <div class="mb-3">

                            <label class="form-label">Address</label>

                            <textarea class="form-control"

                                      name="address"

                                      rows="3"

                                      required></textarea>

                        </div>

                        <div class="mb-3">

                            <label class="form-label">Balance</label>

                            <input type="number"

                                   step="0.01"

                                   class="form-control"

                                   name="balance"

                                   required>

                        </div>

                        <div class="d-grid">

                            <button type="submit" class="btn btn-success">

                                Add Account

                            </button>

                        </div>

                    </form>
		</body>
</html>