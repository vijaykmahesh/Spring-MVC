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

<h1>Hi ${userInfo.userName}</h1>
<h2>Send Result To Your Email</h2>
<form:form action="process-email" modelAttribute="emailDTO">
<label>Your Email-Id :</label>
<form:input path="userEmail"/>
<input type="submit" value="send">
</form:form>

</body>
</html>