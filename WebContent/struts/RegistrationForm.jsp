<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registration Form</title>
</head>

<body>

	<!--<html:errors property="submitError"/>-->

	<html:form action="RegistrationForm.do">
		firstname: <html:text property="firstname" />
		lastname: <html:text property="lastname" />
		<html:submit>submit</html:submit>
	</html:form>
	
</body>
</html>