<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout</title>
</head>
<body>

	<h1>Admin page</h1>
	<h2>WelCome: ${pageContext.request.userPrincipal.name }</h2>
	
	<form action="j_spring_security_logout" method="post">
		<input type="submit" value="Logout">
	</form>

</body>
</html>