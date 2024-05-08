package com.demo.test;

import com.demo.beans.*;
import java.time.LocalDate;
import java.util.Scanner;
import com.demo.beans.contract_emp;
import com.demo.beans.CustomerType;
import com.demo.beans.Emplyoee;
import com.demo.beans.Person;
import com.demo.beans.SalaryEmp;
public class TestEmployee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice : \n1.Person 2.Employee 3.Customer 4.SalariedEmployee 5.ContractEmployee");
		int choice= sc.nextInt();
		
		switch(choice) {
		case 1:
		Person p=new Person(1,"Swapnil",312045);
        System.out.println(p);
        break;
		case 2:
//        Emplyoee e = new Emplyoee(2,"ggfsg",32465,"Comp","sadad",LocalDate.of(2021,6 ,12));
//        System.out.println(e);
//        break;
		case 3:
        CustomerType c=new CustomerType(3,"sdgsfg",41234123,12000);
        System.out.println(c);
        break;
		case 4:
        SalaryEmp s = new SalaryEmp(12,"sdff",245565,"hr","sr hr",LocalDate.of(2022,5,24),2343,0.15);
        System.out.println(s);
        System.out.println("Net salary of Salaried Employee : "+s.calcNetSal());
        break;
		case 5:
        contract_emp ce = new contract_emp(5,"dghgh",455564,"trgf","ftrhtr",LocalDate.of(2022,5,24),5500,7);
        System.out.println(ce);
        System.out.println("Net salary of Contract Employee : "+ce.calcNetSal());
        break;
	}
	}
}
