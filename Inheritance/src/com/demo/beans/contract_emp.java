package com.demo.beans;

import java.time.LocalDate;

public class contract_emp extends Emplyoee {
	private double hrs;
	private double charges;
	public contract_emp(int id,String name,int mob,String dept,String design,LocalDate doj,float hrs, float charges) {
		super(id,name,mob,dept,design,doj);
		this.hrs = hrs;
		this.charges = charges;
	}
	public contract_emp() {
		super();
	}
	public double getHrs() {
		return hrs;
	}
	public void setHrs(float hrs) {
		this.hrs = hrs;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return super.toString()+", hrs=" + hrs + ", charges=" + charges;
	}
	@Override
	public double calcNetSal() {
		return hrs * charges;
	}
}

