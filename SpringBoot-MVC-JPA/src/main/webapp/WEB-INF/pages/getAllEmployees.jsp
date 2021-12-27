<%@page import="com.dbs.entities.Employee"
	import="java.util.*"
%>
<html>
    <head>
        <title>Employee List</title>
    </head>

    <body>
        <h2>Employees</h2>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Department</th>
            </tr>
            <%
                List<Employee> emps = (List<Employee>)request.getAttribute("emps");
                for(Employee employee:emps){
                    %>
                    <tr>
                    	<td><%=employee.getId()%></td>
                    	<td><%=employee.getName()%></td>
                    	<td><%=employee.getDepartment().getName()%></td>
                    </tr>
                <%
                }
                %>
        </table>
    </body>

</html>