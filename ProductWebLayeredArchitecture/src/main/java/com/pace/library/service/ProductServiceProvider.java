package com.pace.library.service;

import java.util.ArrayList;

import com.pace.library.bean.Product;
import com.pace.library.dao.ProductDAO;

public class ProductServiceProvider {
	    private ProductDAO productDAO = new ProductDAO();

	    public void addProduct(Product product) {
	        productDAO.addProducts(product);
	    }

	    public ArrayList<Product> getProducts() {
	        return productDAO.getProducts();
	    }
}