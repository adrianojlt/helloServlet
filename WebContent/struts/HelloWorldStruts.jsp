<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
	<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Struts Examples</title>
</head>

<body>

	<a href="/helloServlet/index.html">Home</a>

	<h1><bean:write name="helloWorldForm" property="message" /></h1>

	<bean:message key="helloworld.description"/>

	<p> <html:link page="/ForwardAction.do">Forward Action Example</html:link> View how struts-config.xml is configured</p>
	<p> <html:link page="/pageExample.do">Page Example</html:link> </p>
	<p> <html:link page="/RegistrationForm.do">Registration Form</html:link> </p>

</body>

</html>