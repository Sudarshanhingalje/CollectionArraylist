package com.demo.beans;
import java.time.LocalDate;

public class SalaryEmp extends Emplyoee{
  private int sal;
  private double bonus;
  public SalaryEmp() {
		super();
	}

	public SalaryEmp(int id ,String name,int mob,String dept,String design,LocalDate doj, int sal, double bonus) {
		super(id,name,mob,dept,design,doj);
		this.sal = sal;
		this.bonus = 0.10 * bonus;
	}

public int getSal() {
	return sal;
}

public void setSal(int sal) {
	this.sal = sal;
}

public double getBonus() {
	return bonus;
}

public void setBonus(int bonus) {
	this.bonus = bonus;
}

@Override
public String toString() {
	return super.toString()+", sal=" + sal + ", bonus=" + bonus;
}

@Override
public double calcNetSal() {
	 return sal+bonus+0.10*sal+0.15*sal-0.08*sal;
}









  
}
