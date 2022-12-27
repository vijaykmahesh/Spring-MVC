<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>homepage</title>
<style type="text/css">

.error {
color: red;
position: fixed;
text-align: left;

}

</style>
<script type="text/javascript">

	function validateUserName() {

		var userName = document.getElementById('yn').value;

		if (userName.length < 1) {
			alert("your name should atleast have 1 character");
			return false;
		} else {
			return true;
		}

	}
</script>
</head>
<body>

	<h1 align="center">Love Calculator</h1>

	<form:form action="process-homepage" method="get"
		modelAttribute="userInfo">

		<div align="center">
			<p>
				<label for="yn">Your Name :</label>
				<form:input type="text" id="yn" path="userName" />
				<form:errors path="userName" cssClass="error"></form:errors>
			</p>

			<p>
				<label for="cn">Crush Name :</label>
				<form:input type="text" id="cn" path="crushName" />
				<form:errors path="crushName" cssClass="error"></form:errors>
			</p>

			<p>
				<form:checkbox path="termAndCondition" id="check" />
				<label>I am agreeing this is for fun</label>
				<form:errors path="termAndCondition" cssClass="error"></form:errors>
			</p>

			<input type="submit" value="calculate">
		</div>
	</form:form>
</body>
</html>