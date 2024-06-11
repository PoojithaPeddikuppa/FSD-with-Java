<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products Page</title>
</head>
<body>
	<%
	ArrayList<Product> productList = (ArrayList<Product>) request.getAttribute("productList");
	%>
	<h2 align="center">Product Details</h2>
	<br>
	<br>
	<h3 align="center">Your Product Details are</h3>
	<%
	for (Product product : productList) {
	%>
	<h4 align="center">
		Product Id:
		<%=product.getProductid()%></h4>
	<h4 align="center">
		Product Id:
		<%=product.getProductname()%></h4>
	<h4 align="center">
		Product Id:
		<%=product.getProductprice()%></h4>
	<%
	}
	%>
	<br>
	<h3 align="center">Thank You for Entering details of Product!</h3>

</body>
</html>