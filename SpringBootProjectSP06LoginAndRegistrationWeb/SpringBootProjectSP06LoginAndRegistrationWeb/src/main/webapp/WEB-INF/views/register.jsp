<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h4>Register Here</h4>
	
	<c:if test="${not empty successMsg}">
    	<h4>${successMsg}</h4>
	</c:if>
	
	<c:if test="${not empty errorMsg}">
    	<h4>${errorMsg}</h4>
	</c:if>
	
	<form action="${pageContext.request.contextPath}/regForm" method="post">
    	Name: <input type="text" name="name" required /> <br /> <br /> 
    	Email: <input type="email" name="email" required /> <br /> <br /> 
    	Password: <input type="password" name="password" required /> <br /> <br /> 
    	Phone No.: <input type="text" name="phoneno" required /> <br /> <br />
    	<input type="submit" value="Register">
	</form>

</body>
</html>