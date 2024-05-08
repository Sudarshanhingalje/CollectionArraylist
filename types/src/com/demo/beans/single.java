package com.demo.beans;

import java.util.Scanner;
public class single {
  int a,b;
  void input(){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  a=sc.nextInt();
	  System.out.println("Enter the number");
	  b=sc.nextInt();
  }
  void add() {
	  System.out.println("addition ="+(a+b));
  }
}
