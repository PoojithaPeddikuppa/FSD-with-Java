<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList,com.pace.library.bean.Book" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<%
session.getAttribute("booklist");
ArrayList<Book> bookList = new ArrayList<Book>();
bookList = (ArrayList<Book>) session.getAttribute("booklist");
%>
<table border='1'>
<%
for(Book book : bookList){
%>
<tr>
<td align="center"><%=book.getBookId()%></td>
<td align="center"><%=book.getBname()%></td>
<td align="center"><%=book.getAuthor()%></td>
<td align="center"><%=book.getPrice()%></td>
</tr>
<%
}
%>
</table>
</body>
</html>