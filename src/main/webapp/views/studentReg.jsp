<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>

	<form:form action="savestudent" modelAttribute="student" method="POST">

		<table>

			<tr>
				<td>Name :</td>
				<td><form:input path="name" /></td>
			</tr>


			<tr>
				<td>Email :</td>
				<td><form:input path="email" /></td>
			</tr>


			<tr>
				<td>MoNumber :</td>
				<td><form:input path="phnumber" /></td>
			</tr>


			<tr>
				<td>Gender :</td>

				<td><form:radiobuttons path="gender" items="${genders}" /></td>
			</tr>


			<tr>
				<td>Courses :</td>

				<td><form:select path="courseName" items="${courses}" /></td>
			</tr>


			<tr>
				<td>Timings :</td>

				<td><form:checkboxes path="timings" items="${timings}" /></td>
			</tr>
           
           <td><input type="submit" value="Register"></td>





		</table>










	</form:form>


</body>
</html>