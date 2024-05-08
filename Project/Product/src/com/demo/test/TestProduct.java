package com.demo.test;
import com.demo.beans.Product;
import com.demo.service.*;

import java.util.List;
import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {
		
		ProductService pservice = new ProductServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		
		int choice = 0;
		do {
				System.out.println("1.Add new product \t 2.Display all \t 3.Display by id \t ");
				System.out.println("4.display by name \t 5.display by price \t 6.Sorted by price \t ");
				System.out.println("7.Sorted by name \t 8.Delete by id 9.Modify Product \t 10.Exit");
				System.out.println("enetr choice");
				 choice = sc.nextInt();
				 switch(choice) {
				 case 1:
					 
				boolean result = pservice.addProduct();
				if(result) {
					System.out.println("Product added");
				}
				else
					System.out.println("error......");
				break;
				
				 case 2:
					 List<Product>plist=pservice.displayALL();
					 plist.stream().forEach(System.out::println);
					 
					 break;
					
				 case 3:
					 System.out.println("enter id ");
					 int id = sc.nextInt();
					 
					 Product p  = pservice.findById(id);
					 
					 if(p != null)
					 {System.out.println("hi");
						 System.out.println(p);
					 }
					 else
					 {
						 System.out.println("product not found");
					 }
					 break;
				 case 4: System.out.println("enter name");
				 String nm = sc.next();
				 List<Product> lst = pservice.displayByName(nm);
				 lst.stream().forEach(ob->System.out.println(ob));
	
				 break;
				 
				 case 5:
					 System.out.println("Enter price");
					 float price = sc.nextFloat();
					 plist = pservice.displayByPrice(price);
					 plist.stream().forEach(ob->System.out.println(ob));
					 break;
					 
				 case 8:
					 System.out.println("Enter id");
					  id = sc.nextInt();
					boolean result1 = pservice.removeById(id);
					 
					 if(result1)
					 System.out.println("deleted Successfully");
					 
					 System.out.println("enter valid id");
					 break;
					 
				 case 9:
						System.out.println("Enter id");
						id = sc.nextInt();
						System.out.println("Enter Quantity");
						int qty = sc.nextInt();
						System.out.println("Enter Price");
					    price = sc.nextFloat();
					    
					    result1 = pservice.modifyById(id,qty,price);
					    
					    if( result1) {
					    	System.out.println("Modified Succesful");
					    }
					    else {
					    	System.out.println("Not Found");
					    }
					    
					    
						break;
					 
 		}
				 
		}	
		
		while(choice!=10);
	}

}
