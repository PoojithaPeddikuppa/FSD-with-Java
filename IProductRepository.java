package com.mycom.springboot.repository;

import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository

import com.mycom.springboot.model.Product;

public interface IProductRepository extends CrudRepository<Product, Integer> {
	
}
