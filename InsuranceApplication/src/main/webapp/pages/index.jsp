<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Report App</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>



	<div class="container-fluid">



		<h3 class="pb-3 pt-3">Insurance Report Application</h3>

		<form:form action="search" modelAttribute="search" method="POST">
			<table>
				<tr>
					<td>Plan Name :</td>
					<td><form:select path="planName">
							<form:option value="">--Select--</form:option>
							<form:options items="${names}" />

							
						</form:select></td>


					<td>Plan Status :</td>
					<td><form:select path="planStatus">
							<form:option value="">--Select--</form:option>	
						    <form:options items="${status}"/> 
							
						</form:select></td>


					<td>Gender:</td>
					<td><form:select path="gender">
							<form:option value="">--Select--</form:option>
							<form:option value="">Male</form:option>
							<form:option value="">Fe-Male</form:option>
						</form:select></td>

					
					
					</tr>
					
				
					<tr>
					
					<td>Start Date:</td>
					<td><form:input type="date" path="startDate" data-date-format="mm/dd/yyyy"></form:input>

							
				<td>End Date:</td>
					<td><form:input type="date" path="endDate" data-date-format="mm/dd/yyyy"></form:input>
				</tr>
			</table>
			<button class="btn btn-primary">Search</button>

		</form:form>



		
		
		
		<hr/>
		<table class="table table-striped table-hover">
			<thead>
				<tr>
					<th>Id</th>
					<th>Plan Name</th>
					<th>Plan Status</th>
					<th>Start Date</th>
					<th>End Date</th>
				</tr>
			</thead>
		</table>



		<hr/>
		
		Export : <a href=""> Excel</a> <a href="">Pdf</a>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>

</body>
</html>