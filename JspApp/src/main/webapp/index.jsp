<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome JSP</title>
</head>
<body bgcolor="yellow">
<font face="verdana" size="20"color="green">
<b>Static Content : </b>Hello World!
<br>
<b>Scriptlet : </b>
<%
for(int num =1;num<10;num++){
	out.println(num);
}
%>
<br>
<b>Declaration: </b>
<%! int number;%> 
<%
number = 287;
%>
<br>
<b>Expression : </b>
<h3><%= number %></h3>
<br>
</font>
</body>
</html>