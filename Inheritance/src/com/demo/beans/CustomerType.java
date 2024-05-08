package com.demo.beans;

public class CustomerType extends Person {
 private int credit_limit;
public CustomerType() {
}

public CustomerType(int id, String name, int mob,int credit_limit) {
	super(id, name, mob);
	this.credit_limit=credit_limit;
}

public int getCredit_limit() {
	return credit_limit;
}

public void setCredit_limit(int credit_limit) {
	this.credit_limit = credit_limit;
}

@Override
public String toString() {
	return super.toString()+", credit_limit=" + credit_limit ;
}




}
