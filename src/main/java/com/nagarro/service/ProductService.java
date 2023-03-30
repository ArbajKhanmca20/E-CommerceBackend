package com.nagarro.service;

import java.util.List;
import java.util.Map;

import com.nagarro.entity.Filter;
import com.nagarro.entity.Product;

import org.springframework.http.ResponseEntity;

public interface ProductService {

	List<Product> getAllProduct(Filter filter);
	

	ResponseEntity<Product> getProductById(int Id);

	Product adddProduct(Product Product);

	ResponseEntity<Product> updateProduct(int id, Product prodDetails);

	ResponseEntity<Map<String, Boolean>> deleteProduct(int id);

}
