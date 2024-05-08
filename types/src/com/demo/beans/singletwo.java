package com.demo.beans;


import java.util.Scanner;
import types.single;

	public class singletwo extends single {
	   int c;
	   void getdata() {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the number");
			  c=sc.nextInt();
	   }
	   void display() {
		   System.out.println("addition ="+(a+b+c));
	   }

	}

