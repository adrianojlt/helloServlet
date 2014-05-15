<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Form</title>
	
	<style type="text/css">
		span.result {
			color: red;
		}
		span.key {
			color: blue;
		}
	</style>
	
</head>

<body>

	<a href="/helloServlet/index.html">Home</a>
	<a href="/helloServlet/FormServlet">Back</a>

	<p>Name: <span class="result">${requestScope.name}</span></p>
	<p>Pass: <span class="result">${requestScope.pass}</span></p>
	<p>Mail: <span class="result">${requestScope.mail}</span></p>
	<p>Country: <span class="result">${requestScope.country}</span></p>
	
	<hr>

	allParameterNames: 
	<c:forEach items="${requestScope.allParameterNames}" var="name">
		<span class="key"> <c:out value="${name}"></c:out> </span> ,
	</c:forEach>
	
	<br />

	<c:forEach var="entry" items="${allParameterMap}">
		key: <span class="key"> <c:out value="${entry.key}" /> </span>
		value: <span class="result"> <c:out value="${entry.value[0]}" /> </span>
		;
	</c:forEach>

</body>

</html>