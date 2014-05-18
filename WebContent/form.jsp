<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Form</title>
	
	<style type="text/css">
		.inputClass { 
			position: static;
			float: left;
		}
		.clear {clear: both;}
		input, select, option {color: red;}
		input[type=submit] {
			color: black;
			font-weight: bold;
		}
	</style>
	
</head>

<body>

	<a href="/helloServlet/index.html">Home</a>
	
	<hr>

	<form action="/helloServlet/FormServlet" method="post">  
  
		<div class="inputClass">Name:<input type="text" name="name" value="myName"></input></div>
		<div class="inputClass">Password:<input type="password" name="pass" value="myPass"></input></div>
		<div class="inputClass">Email:<input type="text" name="mail" value="myMail"></input></div>
		
		<div class="clear"></div>

		<div class="inputClass">
			Country:  
			<select name="country">  
				<option>India</option>  
				<option>Pakistan</option>  
				<option>other</option>  
			</select>  
		</div>

		<input type="submit" name="submitButton" value="GO"/>  
		
		<hr />

		<div class="inputClass">01:<input type="text" name="dyn-01" value=""></input></div>

		<input type="submit" name="submitButton" value="Dynamic"/>  
  
	</form>  

</body>

</html>