package com.practices.java8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeePredicate {

	String name;
	
	int salary;

	public EmployeePredicate(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "EmployeePredicate [name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		ArrayList<EmployeePredicate> pred=new ArrayList<EmployeePredicate>();
		pred.add(new EmployeePredicate("mano", 10000));
		pred.add(new EmployeePredicate("naveen", 20000));
		pred.add(new EmployeePredicate("pandu", 300000));
		Predicate<EmployeePredicate> p=e->e.salary>20000;
		for(EmployeePredicate e1:pred)
		{
			if(p.test(e1))
			{
				System.out.println(e1);
			}
		}
	}
}
