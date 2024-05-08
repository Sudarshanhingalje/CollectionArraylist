package com.demo.dao;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.demo.beans.*;
public class ProductDaoImpl implements ProductDao{

	static List<Product> plist  ;
	static {
		plist=new ArrayList<>();
		plist.add(new Product(1, "Lays" , 3, 20, LocalDate.of(2022, 12, 11)));
		plist.add(new Product(2, "Maggi" , 2, 15, LocalDate.of(2021, 2, 11)));
		plist.add(new Product(3, "Bourbon" , 5, 25, LocalDate.of(2019, 12, 01)));
		plist.add(new Product(4, "HidenSeek" , 7, 30, LocalDate.of(2022, 4, 02)));
		plist.add(new Product(5, "KinderJoy" , 1, 50, LocalDate.of(2014, 5, 07)));
	}
	@Override
	public boolean save(Product p) {

		return plist.add(p);
		
		
	}
	@Override
	public List<Product> findall() {
		
		return plist;
	}
	@Override
	public Product displayById(int id) {

		int pos = plist.indexOf(new Product(id));
        if(pos!=-1)
     	{
			return plist.get(pos);
	    }
     	return null;
	}
	@Override
	public List<Product> findByName(String nm) {
		
	 List<Product> lst = plist.stream().filter(ob->ob.getName().equals(nm)).collect(Collectors.toList());
		return lst;
	}
	@Override
	public List<Product> findByPrice(float price) {
		List <Product> lst = plist.stream().filter(ob->ob.getPrice()>price).collect(Collectors.toList());
		return lst;
	}
	@Override
	public boolean deleteById(int id) {
		
		return plist.remove(new Product(id));
	}
	@Override
	public boolean updateById(int id, int qty, float price) {
		Product p = displayById(id);
		if(p!= null) {
			p.setQty(qty);
			p.setPrice(price);
		return true;
		}
		return false;

	
		
	}

}
