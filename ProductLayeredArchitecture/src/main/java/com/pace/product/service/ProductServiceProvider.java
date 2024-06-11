package com.pace.product.service;
import com.pace.product.bean.Product;
import com.pace.product.dao.ProductDAO;
import java.util.ArrayList;
public class ProductServiceProvider {
	private ProductDAO productDAO = new ProductDAO();
    public void addDetails(Product product) {
		productDAO.addDetails(product);
	}
    public ArrayList<Product> sendDetails() {
		return productDAO.sendDetails();
	}
}