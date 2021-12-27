<%@page import="com.dbs.entities.Department" 
	import="java.util.List"
%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<title>newEmp</title>
	</head>
	<body>
		<h2>Employee Registration</h2>
		<form:form action="saveEmp" method="post" modelAttribute="employee">
			<form:label path="name">Name</form:label>
			<form:input path="name"/>
			<br><br>
			<form:label path="department">Department</form:label>
			<%List<Department> departments = (List<Department>)request.getAttribute("departments"); %>
			<form:select path="department" items="${departments}" itemLabel="name" itemValue="id"/>
			<br><br>
			<input type="submit" value="Register"/>
		</form:form>
	</body>
</html>