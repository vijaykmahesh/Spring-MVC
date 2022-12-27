<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Register Here</h1>

	<div align="center">
		<form:form  action="registration-success" modelAttribute="userReg">
			<label for="name">Name :</label>
			<form:input id="name" path="name" />

			<br />

			<label for="userName">UserName :</label>
			<form:input id="userName" path="userName" />

			<br />
			<label for="password">Password :</label>
			<form:password id="password" path="password" />

			<br />

			<label>Country :</label>
			<form:select path="countryName">
				<form:option value="Ind" label="India"></form:option>
				<form:option value="SA" label="SouthAfrica"></form:option>
				<form:option value="Aus" label="Australia"></form:option>

			</form:select>
			<br />

			<label>Hobby :</label>
	Cricket : <form:checkbox path="hobbies" value="cricket" />
	Carrom : <form:checkbox path="hobbies" value="carrom" />
	Travel : <form:checkbox path="hobbies" value="travel" />

			<br />
			<label>Gender :</label>
	Male :<form:radiobutton path="gender" value="male" />
	Female :<form:radiobutton path="gender" value="female" />

			<input type="submit" value="Register">

		</form:form>

	</div>


</body>
</html>