<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <body>
		<a href="/helloServlet/index.html">Home</a>
		<hr>
        <h2>Coffee Advisor Output</h2>
        <c:forEach var="type" items="${types}">
            <c:out value="${type}"/>
            <br />
        </c:forEach>
    </body>
</html>

