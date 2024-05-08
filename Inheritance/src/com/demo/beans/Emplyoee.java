package com.demo.beans;
import java.time.LocalDate;

public abstract class Emplyoee extends Person {
  private String dept,design;
  private LocalDate doj;
public Emplyoee() {	
}
public Emplyoee(int id, String name, int mob ,String dept, String design, LocalDate doj) {
	super(id, name, mob);
	this.dept = dept;
	this.design = design;
	this.doj = doj;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public String getDesign() {
	return design;
}

public void setDesign(String design) {
	this.design = design;
}

public LocalDate getDoj() {
	return doj;
}

public void setDoj(LocalDate doj) {
	this.doj = doj;
}
public abstract double calcNetSal();  
@Override
public String toString() {
	return super.toString()+", dept=" + dept + ", design=" + design + ", doj=" + doj ;
}
}
