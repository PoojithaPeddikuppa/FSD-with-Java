<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.pace.bean.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Session Page</title>
</head>
<body>
<h3>Dynamic Data from Servlet</h3>
<%
session = request.getSession();
User user = (User) session.getAttribute("user");
out.println("Hello " + user.getUsername() + "<br>");
out.println("Hello " + user.getEmailid() + "<br>");
%>
<h3>Dynamic Data from Servlet </h3>
<table border="1">
<tr>
<th>User Name</th>
<th>Email Id</th>
</tr>
<tr>
<td><%=user.getUsername()%></td>
<td><%=user.getEmailid()%></td>
</tr>
</table>

</body>
</html>


// a collection of objects can be set as session attribute.
//book list is set as session attribute.
//one servlet can run only one server.
//using a web application two or more clients can utilize it at the same time . Whereas in standalone application, only one user can work on it.
//only one employee can work with the standalone application.
/*book management system
show book details
delete book details

















