package com.mycom.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycom.springboot.model.Product;
import com.mycom.springboot.service.ProductService;

//mark class as Controller
@RestController
@RequestMapping("api/v1/products")
public class ProductController {
//Autowire the BooksService class
	@Autowired
	ProductService productService;
	
	//creating a get mapping that retrieves all the books detail from the database 
		@GetMapping("/getallproducts")
		private List<Product> getAllProducts() {
			return productService.getAllProducts();
		}
	
	//creating post mapping that post the book detail in the database
		@PostMapping("/addbook")
		private int saveProduct(@RequestBody Product product) {
			productService.saveProduct(product);
			return product.getProductid(); 
			// book id will be sent to response body of postman after inserting book data
		}
		
//creating a get mapping that retrieves the detail of a specific book
		@GetMapping("/getproduct/{productid}")
		private Product getProducts(@PathVariable("productid") int productid) {
			return productService.getProductById(productid);
		}
	
	//creating put mapping that updates the book detail 
		@PutMapping("/updateproduct")
		private Product update(@RequestBody Product product) {
			productService.updateProduct(product);
			return product;
		}

//creating a delete mapping that deletes a specified book
	@DeleteMapping("/deleteproduct/{productid}")
	private void deleteProduct(@PathVariable("productid") int productid) {
		productService.deleteProduct(productid);
	}

}
