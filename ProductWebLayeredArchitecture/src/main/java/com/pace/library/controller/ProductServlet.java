package com.pace.library.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pace.library.bean.Product;
import com.pace.library.service.ProductServiceProvider;

public class ProductServlet extends HttpServlet {
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        int id = request.getParameter("id");
	        String name = request.getParameter("name");
	        String price = request.getParameter("price");
	        Product product = new Product();
	        ProductServiceProvider provider = new ProductServiceProvider();
	        ProductServiceprovider.addProducts(product);
	        ArrayList<Product> productList = provider.getProducts();
	        request.setAttribute("productList", productList);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("products.jsp");
	        dispatcher.forward(request, response);
	    }
	}
