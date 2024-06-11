package com.pace.product.controller;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.pace.product.bean.Product;
import com.pace.product.service.ProductServiceProvider;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
* @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
*/
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
int id,price;
String name;
id=Integer.parseInt(request.getParameter("id"));
name=request.getParameter("name");
price=Integer.parseInt(request.getParameter("price"));

Product product=new Product(id, name, price);

ProductServiceProvider psp=new ProductServiceProvider();
psp.addDetails(product);
//productList=psp.sendDetails(productList);


ArrayList<Product> productList=psp.sendDetails();

request.setAttribute("productList",productList);
RequestDispatcher dis=request.getRequestDispatcher("products.jsp");
dis.forward(request,response);
}

}

