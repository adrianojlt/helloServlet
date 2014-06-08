<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 		prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<title>Being a JSTL</title>

	<style type="text/css" media="Screen"> 
		table, th, td {
			border: 1px solid;
		}
		
		.box {
			float: left;
		}
	</style>

</head>

<body>
	
	<a href="/helloServlet/index.html">Home</a>

	<hr>

	<div class="box">
		<table>
			<thead>
				<tr>
					<th>Name</th>
					<th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${requestScope.product}" var="prt">
					<tr>
						<td><c:out value="${prt.name}"></c:out></td>
						<td><c:out value="${prt.price}"></c:out></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<div class="box">
		<c:forEach var="i" begin="1" end="10" >
	    	<c:out value="${i}" /> 
	  	</c:forEach>
	</div>
	
	<div style="clear: both;"></div>

	<hr>
	
	<jsp:useBean id="shoes" class="pt.adrianz.helloservlet.beans.Product" scope="request"></jsp:useBean>
	<jsp:getProperty property="name" name="shoes"/>
	
	<hr>
	
	All Music from an Array: ${musics} ; First Song: ${musics[0]} ; Secound Song: ${musics["1"]} - 
	All Musics: ${musicsArrayList} ;
	<br>
	<c:out value="${fn:length('hello')}"> </c:out>

</body>

</html>