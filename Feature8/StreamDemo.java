package com.practices.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
public static void main(String[] args) {
		ArrayList<Employee> e=new ArrayList<>();
		Employee e1=new Employee("Mano", 1,2, 10000);
		Employee e2=new Employee("Pandu", 2, 3, 30000);
		Employee e3=new Employee("Maha", 3, 5, 50000);
		e.add(e1);
		e.add(e2);
		e.add(e3);
		Stream<Employee> emp=e.stream();
		System.out.println(emp);
		Stream<String> empStream=emp.map(el->el.getName());
		empStream.forEach(System.out::println);
		Stream<Employee> empSalary=emp.filter(eps->eps.getSalary()>40000);
		empSalary.forEach(System.out::println);
		System.out.println(empStream);
		
}
}
