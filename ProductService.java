package com.mycom.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycom.springboot.model.Product;
import com.mycom.springboot.repository.IProductRepository;

//defining the business logic
@Service
public class ProductService {
	@Autowired
	IProductRepository productsRepository;

	// getting all books record by using the method findAll() of CrudRepository
	public List<Product> getAllProducts() {
		List<Product> productList;

		productList = (List<Product>) productsRepository.findAll();
		for (Product product : productList) {
			System.out.println(product.getProductname());
		}
		return productList;
	}

	// getting a specific record by using the method findById() of CrudRepository
	public Product getProductById(int id) {
		return productsRepository.findById(id).get();
	}

	// saving a specific record by using the method save() of CrudRepository
	public void saveProduct(Product product) {
		productsRepository.save(product);
	}

	// updating a record
	public void updateProduct(Product product) {
		productsRepository.save(product);
	}

	//deleting a specific record by using the method deleteById() of CrudRepository
	public void deleteProduct(int id) {
		productsRepository.deleteById(id);
	}

}