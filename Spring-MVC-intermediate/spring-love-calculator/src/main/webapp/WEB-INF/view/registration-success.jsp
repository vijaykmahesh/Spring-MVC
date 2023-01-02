<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Registration is successfull</h1>
	<h2>The details entered by you are :</h2>

	Name is ${userReg.name}
	<br /> Gender is ${userReg.gender}
	<br /> UserName is ${userReg.userName}
	<br /> Password is ${userReg.password}
	<br /> CountryName is ${userReg.countryName}
	<br /> Hobbies:

	<c:forEach var="temp" items="${userReg.hobbies}">
	${temp}
	</c:forEach>
	<br/>
	
	Email : ${userReg.communicationDTO.email}
	
	<br/>
	Phone : ${userReg.communicationDTO.phone}


</body>
</html>