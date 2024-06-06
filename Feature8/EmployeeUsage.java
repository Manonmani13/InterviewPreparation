package com.practices.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeUsage {
public static void main(String[] args) {
	ArrayList<EmployeeWithCompartor> e=new ArrayList<>();
	e.add(new EmployeeWithCompartor("Mano",3));
	e.add(new EmployeeWithCompartor("Naveen",2));
	Collections.sort(e,(s1,s2)->s1.name.compareTo(s2.name));
	System.out.println(e);
	
}
}
