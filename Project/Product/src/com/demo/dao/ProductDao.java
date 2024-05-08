package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	boolean save(Product p);

	List<Product> findall();

	Product displayById(int id);

	List<Product> findByName(String nm);

	List<Product> findByPrice(float price);

	boolean deleteById(int id);

	boolean updateById(int id, int qty, float price);

	

}
