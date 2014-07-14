<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="pt.adrianz.helloservlet.beans.Product" %>
<%@ page import="pt.adrianz.helloservlet.beans.ProductService" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html lang="en">

<head>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<title>List</title>

	<!--  <link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">-->
	
	<style type="text/css">
		.container {/*width:600px;*/}
		.navbar-nav.nav-justified > li { /*float:none;*/ }
	</style>
    
	
</head>

<body>

<!--
	<div class="container">
    	<div class="navbar">
        	<ul class="nav navbar-nav nav-justified">
            	<li class="active"><a href="tmp/list.jsp">List</a></li> 
            	<li><a href="tmp/view.jsp">View</a></li>
				<li><a href="tmp/edit.jsp">Edit</a></li>
			</ul>
		</div>
	</div>
-->

<!--
<div class="container">
	<ul class="nav nav-pills nav-stacked"
		<li class=""><a href="tmp/list.jsp">List</a></li> 
		<li class="active"><a href="tmp/list.jsp">List</a></li> 
		<li class=""><a href="tmp/list.jsp">List</a></li> 
	</ul>
</div>
-->

<!--
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
	<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
-->

<a href="/helloServlet/index.html">Home</a>

<hr>

<ul>
	<li><a href="product">list</a></li>
	<li><a href="#">insert</a></li>
</ul>

<hr>

	<h1>Product List</h1>
	
	<table>
	    <tr>
	            <td><b>Name</b></td>
	            <td><b>Options</b></td>
	    </tr>
	
	    <% if ( request.getAttribute("products") != null ) {
	    	for (Product product : (List<Product>)request.getAttribute("products")) { %>
	    		<tr>
	        		<td><%= product.getName()%></td>
	        		<td><a href="product?id=<%= product.getId()%>">Details...</a></td>
	    		</tr>
	    <% }} %>
	
	</table>
	
</body>

</html>