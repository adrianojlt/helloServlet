<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 	<title>Pagination</title>
 	<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>

	<a href="/helloServlet/index.html">Home</a>

	<hr>
	
	<div class="container">

		<table class="table">
	
			<tr>
				<th>Emp ID</th>
				<th>Emp Name</th>
				<th>Salary</th>
				<th>Dept Name</th>
			</tr>
	
			<c:forEach var="employee" items="${employeeList}">
				<tr>
					<td>${employee.employeeId}</td>
					<td>${employee.employeeName}</td>
					<td>${employee.salary}</td>
					<td>${employee.deptName}</td>
				</tr>
			</c:forEach>

		</table>
		
		<ul class="pagination">

			<%--For displaying Previous link except for the 1st page --%>
			<c:choose>
				<c:when test="${currentPage != 1}">
					<li>
						<a href="/helloServlet/employee.do?page=${currentPage - 1}">&laquo;</a>
					</li> 
				</c:when>
				<c:otherwise>
					<li class="disabled">
						<a href="#">&laquo;</a>
					</li>
				</c:otherwise>
			</c:choose>

			<%--For displaying Page numbers. The when condition does not display a link for the current page--%>
			<c:forEach begin="1" end="${noOfPages}" var="i">
				<c:choose>
					<c:when test="${currentPage eq i}">
						<li class="disabled"><a href="#">${i}</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="/helloServlet/employee.do?page=${i}">${i}</a></li>
					</c:otherwise>
				</c:choose>
			</c:forEach>
			
			<%--For displaying Next link --%>
			<c:choose>
				<c:when test="${currentPage lt noOfPages}">
					<li>
						<a href="/helloServlet/employee.do?page=${currentPage + 1}">&raquo;</a>
					</li> 
				</c:when>
				<c:otherwise>
					<li class="disabled">
						<a href="#">&raquo;</a>
					</li>
				</c:otherwise>
			</c:choose>

		</ul>

	</div>

</body>

</html>