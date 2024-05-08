package com.beans;

public class Account {

	
	 private int id;
	 private double balance;
	 private String name;
	 private String address;
	 
	 
	 public Account(int id, double balance, String name, String address) {
		 
			super();
			this.id = id;
			this.balance = balance;
			this.name = name;
			this.address = address;
		}
		public Account() {
			super();
			System.out.println("Default Account Contrsctor");
			
		}
	 
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", name=" + name + ", address=" + address + "]";
	}
	
	 
}
