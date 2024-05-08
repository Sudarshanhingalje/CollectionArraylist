package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	boolean addProduct();

	List<Product> displayALL();

	Product findById(int id);

	List<Product> displayByName(String nm);

	List<Product> displayByPrice(float price);

	boolean removeById(int id);

	boolean modifyById(int id, int qty, float price);

	
	

}
